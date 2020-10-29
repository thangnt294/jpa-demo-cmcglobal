package com.cmcglobal.demo.api.repository;

import com.cmcglobal.demo.api.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
}
