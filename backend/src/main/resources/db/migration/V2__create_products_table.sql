CREATE TABLE products
(
    id          UUID PRIMARY KEY,
    sku         VARCHAR(50)     NOT NULL UNIQUE,
    name        VARCHAR(150)    NOT NULL,
    brand       VARCHAR(100)    NOT NULL,
    category    VARCHAR(50)     NOT NULL,
    price       NUMERIC(10, 2)  NOT NULL,
    created_at  TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at  TIMESTAMP WITH TIME ZONE NOT NULL,

    CONSTRAINT chk_products_price_non_negative
        CHECK (price >= 0)
);

CREATE INDEX idx_products_name
    ON products (name);

CREATE INDEX idx_products_category
    ON products (category);