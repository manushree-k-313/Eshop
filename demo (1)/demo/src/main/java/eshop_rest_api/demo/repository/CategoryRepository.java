package eshop_rest_api.demo.repository;

import eshop_rest_api.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
