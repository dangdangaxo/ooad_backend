package com.vlu.bokkit.service;

import com.vlu.bokkit.dto.DetailedNewsDTO;
import com.vlu.bokkit.dto.NewsDTO;

import java.util.List;

public interface NewsService {
    DetailedNewsDTO createNews(NewsDTO newsDTO);

    List<NewsDTO> getAllNews();
}
