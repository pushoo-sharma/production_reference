package com.productionready.canada.repository;


import com.productionready.canada.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}