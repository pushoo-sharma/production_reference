package com.productionready.canada.repository;

import com.productionready.canada.domain.Bookmark;
import com.productionready.canada.domain.BookmarkDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("""
    select new com.productionready.canada.domain.BookmarkDTO(b.id, b.title, b.url) from Bookmark b
    """)
    Page<BookmarkDTO> findBy(Pageable pageable);

}