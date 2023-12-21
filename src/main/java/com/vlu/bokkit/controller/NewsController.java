package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.NewsDTO;
import com.vlu.bokkit.service.NewsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/news")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    public NewsDTO createNews(@Validated @RequestBody NewsDTO newsDTO) {
        return newsService.createNews(newsDTO);
    }

    @GetMapping
    public List<NewsDTO> getAllNews() {
        return newsService.getAllNews();
    }
}
