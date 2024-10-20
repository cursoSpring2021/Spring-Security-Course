package com.course_spring_security_course.repository;

import com.course_spring_security_course.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
