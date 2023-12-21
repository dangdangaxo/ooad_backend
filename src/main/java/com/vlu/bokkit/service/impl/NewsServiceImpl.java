package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.DetailedNewsDTO;
import com.vlu.bokkit.dto.NewsDTO;
import com.vlu.bokkit.entity.News;
import com.vlu.bokkit.repository.NewsRepository;
import com.vlu.bokkit.service.NewsService;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    @Override
    public DetailedNewsDTO createNews(NewsDTO newsDTO) {
        News currentNews = new News();
        return convertEntityToDTO(newsRepository.save(currentNews));
    }

    @Override
    public List<NewsDTO> getAllNews() {
        List<News> news = newsRepository.findAll();
        return news.stream().
                map(this::convertNewsToNewsDTO).
                collect(Collectors.toList());
    }

    private NewsDTO convertNewsToNewsDTO(News news) {
        NewsDTO newsDTO = new NewsDTO();
        BeanUtils.copyProperties(news, newsDTO);
        return newsDTO;
    }
    private DetailedNewsDTO convertEntityToDTO(News news) {
        DetailedNewsDTO detailedNewsDTO = new DetailedNewsDTO();
        BeanUtils.copyProperties(news, detailedNewsDTO);
        return detailedNewsDTO;
    }
}
