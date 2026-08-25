package app.netlify.jinzo.ulkona.product.application;

import app.netlify.jinzo.ulkona.common.error.DuplicateResourceException;
import app.netlify.jinzo.ulkona.product.api.CreateProductRequest;
import app.netlify.jinzo.ulkona.product.domain.ProductCategory;
import app.netlify.jinzo.ulkona.product.domain.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test
    void shouldRejectDuplicateSku() {
        ProductService productService = new ProductService(productRepository);

        CreateProductRequest request = new CreateProductRequest(
                "ULK-BAG-001",
                "Hiking Backpack",
                "Ayacucho",
                ProductCategory.BACKPACK,
                new BigDecimal("129.99")
        );

        when(productRepository.existsBySkuIgnoreCase("ULK-BAG-001"))
                .thenReturn(true);

        assertThatThrownBy(() -> productService.create(request))
                .isInstanceOf(DuplicateResourceException.class)
                .hasMessageContaining("ULK-BAG-001");
    }
}
