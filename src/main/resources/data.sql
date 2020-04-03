DROP TABLE IF EXISTS products;

CREATE TABLE products (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(500) NOT NULL
);

INSERT INTO products (title, description) VALUES
  ('camera', 'digital camera 42x optical zoom'),
  ('phone', 'Huawei P30 Lite 128GB with 4GB RAM'),
  ('laptop', 'Apple MacBook Pro 13-inch, 256GB with 8GB RAM');