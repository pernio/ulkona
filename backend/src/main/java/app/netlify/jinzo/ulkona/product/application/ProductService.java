package app.netlify.jinzo.ulkona.product.application;

import app.netlify.jinzo.ulkona.common.error.DuplicateResourceException;
import app.netlify.jinzo.ulkona.common.error.ResourceNotFoundException;
import app.netlify.jinzo.ulkona.product.api.CreateProductRequest;
import app.netlify.jinzo.ulkona.product.api.ProductResponse;
import app.netlify.jinzo.ulkona.product.domain.Product;
import app.netlify.jinzo.ulkona.product.domain.ProductRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(@NotNull ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse create(CreateProductRequest request) {
        String normalizedSku = request.sku().trim().toUpperCase();

        if (productRepository.existsBySkuIgnoreCase(normalizedSku)) {
            throw new DuplicateResourceException(
                    "A product with SKU '%s' already exists".formatted(normalizedSku)
            );
        }

        Product product = new Product(
                normalizedSku,
                request.name().trim(),
                request.brand().trim(),
                request.category(),
                request.price()
        );

        Product savedProduct = productRepository.save(product);
        return ProductResponse.from(savedProduct);
    }

    @Transactional(readOnly = true)
    public ProductResponse findById(@NotNull UUID id) {
        return productRepository.findById(id)
                .map(ProductResponse::from)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Product '%s' was not found".formatted(id)
                ));
    }

    @Transactional(readOnly = true)
    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductResponse::from)
                .toList();
    }
}
