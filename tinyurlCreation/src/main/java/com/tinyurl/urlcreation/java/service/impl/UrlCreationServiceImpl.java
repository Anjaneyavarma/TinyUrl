package com.tinyurl.urlcreation.java.service.impl;

import com.tinyurl.urlcreation.java.entity.UrlTable;
import com.tinyurl.urlcreation.java.repository.TinyURLRepository;
import com.tinyurl.urlcreation.java.service.IUrlCreationService;
import com.tinyurl.urlcreation.java.utils.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UrlCreationServiceImpl implements IUrlCreationService {

    @Autowired
    private TinyURLRepository tinyURLRepository;

    @Override
    public String createShortUrl(String longUrl) {
        List<UrlTable> url = tinyURLRepository.findByLongUrl(longUrl);
        if(url.size()==1){
            return url.get(0).getShortUrl();
        }
        BigInteger number = Hashing.hasing(longUrl);
        String shortUrlId = Hashing.toBase62(number);
        UrlTable urlTable = new UrlTable();
        urlTable.setShortUrl(shortUrlId);
        urlTable.setLongUrl(longUrl);
        urlTable.setId(number);
        tinyURLRepository.save(urlTable);
        return shortUrlId;
    }
}
