package com.tinyurl.urlcreation.java.controller;

import com.tinyurl.urlcreation.java.service.IUrlCreationService;
import com.tinyurl.urlcreation.java.vo.CreateShortUrlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CreateShortUrlController {

    @Autowired
    private IUrlCreationService urlCreationService;

    @PostMapping("/createShortUrl")
    public ResponseEntity<String> createShortUrl(@RequestBody CreateShortUrlVO createShortUrlVO){
        return new ResponseEntity<>(urlCreationService.createShortUrl(createShortUrlVO.getLongUrl()), HttpStatusCode.valueOf(200));
    }
}
