package com.tinyurl.redirection.service.impl;

import org.springframework.stereotype.Service;

public interface RedirectionService {
    public String fetchLongUrl(String shortUrl);
}
