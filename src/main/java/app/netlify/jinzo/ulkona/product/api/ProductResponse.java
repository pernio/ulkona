package app.netlify.jinzo.ulkona.product.api;

import app.netlify.jinzo.ulkona.product.domain.Product;
import app.netlify.jinzo.ulkona.product.domain.ProductCategory;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record ProductResponse(
        UUID id,
        String sku,
        String name,
        String brand,
        ProductCategory category,
        BigDecimal price,
        Instant createdAt,
        Instant updatedAt
) {

    public static ProductResponse from(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getSku(),
                product.getName(),
                product.getBrand(),
                product.getCategory(),
                product.getPrice(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}
