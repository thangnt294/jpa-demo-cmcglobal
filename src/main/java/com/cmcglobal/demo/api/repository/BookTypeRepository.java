package com.cmcglobal.demo.api.repository;


import com.cmcglobal.demo.api.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTypeRepository extends JpaRepository<BookType, Integer> {
}
