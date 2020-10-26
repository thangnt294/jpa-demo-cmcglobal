package com.cmcglobal.demo.api.repository;

import com.cmcglobal.demo.api.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {
}
