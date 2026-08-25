package app.netlify.jinzo.ulkona.product.domain;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    boolean existsBySkuIgnoreCase(@NotNull String sku);

    Optional<Product> findBySkuIgnoreCase(@NotNull String sku);
}
