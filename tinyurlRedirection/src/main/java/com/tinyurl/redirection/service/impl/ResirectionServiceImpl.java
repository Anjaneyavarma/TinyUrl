package com.tinyurl.redirection.service.impl;

import com.tinyurl.redirection.entity.UrlTable;
import com.tinyurl.redirection.repository.RedirectionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResirectionServiceImpl implements RedirectionService {

    @Autowired
    private RedirectionRespository redirectionRespository;

    @Override
    public String fetchLongUrl(String shortUrl) {
        List<UrlTable> urlTables = redirectionRespository.findByShortUrl(shortUrl);
        return urlTables.get(0).getLongUrl();
    }
}
