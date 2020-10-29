package com.cmcglobal.demo.api.repository;

import com.cmcglobal.demo.api.entity.DigitalBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalBookRepository extends JpaRepository<DigitalBook, Integer> {
}
