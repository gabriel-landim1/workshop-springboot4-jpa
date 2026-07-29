package com.landim.spring.repositories;

import com.landim.spring.entities.Category;
import com.landim.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
