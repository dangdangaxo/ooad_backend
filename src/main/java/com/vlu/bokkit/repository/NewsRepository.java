package com.vlu.bokkit.repository;

import com.vlu.bokkit.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
    News findNewsByNewsId(String newsId);
}
