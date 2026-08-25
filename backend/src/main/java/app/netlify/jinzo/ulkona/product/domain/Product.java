package app.netlify.jinzo.ulkona.product.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true, length = 50)
    private String sku;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 100)
    private String brand;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private ProductCategory category;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;

    protected Product() {
        // Required by JPA
    }

    public Product(
            String sku,
            String name,
            String brand,
            ProductCategory category,
            BigDecimal price
    ) {
        this.id = UUID.randomUUID();
        this.sku = sku;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    @NotNull
    public UUID getId() {
        return id;
    }

    @NotNull
    public String getSku() {
        return sku;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getBrand() {
        return brand;
    }

    @NotNull
    public ProductCategory getCategory() {
        return category;
    }

    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    public Instant getCreatedAt() {
        return createdAt;
    }

    @NotNull
    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
