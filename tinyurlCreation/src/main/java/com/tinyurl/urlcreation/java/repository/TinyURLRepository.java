package com.tinyurl.urlcreation.java.repository;

import com.tinyurl.urlcreation.java.entity.UrlTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TinyURLRepository extends JpaRepository<UrlTable, Long> {
    public List<UrlTable> findByLongUrl(String lngUrl);
}
