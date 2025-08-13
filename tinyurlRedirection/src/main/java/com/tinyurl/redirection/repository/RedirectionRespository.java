package com.tinyurl.redirection.repository;

import com.tinyurl.redirection.entity.UrlTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedirectionRespository extends JpaRepository<UrlTable, Long> {
    public List<UrlTable> findByShortUrl(String shortId);
}
