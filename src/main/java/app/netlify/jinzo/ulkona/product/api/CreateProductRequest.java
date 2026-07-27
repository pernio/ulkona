package app.netlify.jinzo.ulkona.product.api;

import app.netlify.jinzo.ulkona.product.domain.ProductCategory;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CreateProductRequest(
        @NotBlank
        @Size(max = 50)
        String sku,

        @NotBlank
        @Size(max = 150)
        String name,

        @NotBlank
        @Size(max = 100)
        String brand,

        @NotNull
        ProductCategory category,

        @NotNull
        @DecimalMin(value = "0.00")
        @Digits(integer = 8, fraction = 2)
        BigDecimal price
) {
}
