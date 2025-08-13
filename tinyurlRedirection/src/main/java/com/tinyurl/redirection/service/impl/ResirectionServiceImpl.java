package com.tinyurl.redirection.service.impl;

import com.tinyurl.redirection.entity.UrlTable;
import com.tinyurl.redirection.repository.RedirectionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResirectionServiceImpl implements RedirectionService {

    @Autowired
    private RedirectionRespository redirectionRespository;

    @Override
    @Cacheable(key = "#shortUrl", value = "urlTables")
    public String fetchLongUrl(String shortUrl) {
        System.out.println("Fetching from DB...");
        List<UrlTable> urlTables = redirectionRespository.findByShortUrl(shortUrl);
        return urlTables.get(0).getLongUrl();
    }
}
