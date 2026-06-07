package com.lucascardoso.dscatalog.repositories;

import com.lucascardoso.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
