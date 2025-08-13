package com.tinyurl.redirection.controller;

import com.tinyurl.redirection.service.impl.RedirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RedirectionController {

    @Autowired
    private RedirectionService redirectionService;

    @GetMapping("api/v1/redirect/{shortUrl}")
    public RedirectView redirectToLongUrl(@PathVariable(name = "shortUrl") String shortUrl){
        return new RedirectView(redirectionService.fetchLongUrl(shortUrl));
    }
}
