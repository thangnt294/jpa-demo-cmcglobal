package com.cmcglobal.demo.api.repository;

import com.cmcglobal.demo.api.entity.PaperBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperBookRepository extends JpaRepository<PaperBook, Integer> {
}
