package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.NewsDTO;
import com.vlu.bokkit.entity.News;
import com.vlu.bokkit.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService
                                  newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    public NewsDTO createNews(@Validated @RequestBody NewsDTO newsDTO) {
        return newsService.createNews(newsDTO);
    }

    @GetMapping
    public List<NewsDTO> getAllNews() {
        List<NewsDTO> newsDTOs = newsService.getAllNews();
//        System.prin.info("Retrieved {} news items.", newsDTOs.size());
        System.out.println("Retrieved {} news items." + newsDTOs.size());
        return newsService.getAllNews();

    }
}
