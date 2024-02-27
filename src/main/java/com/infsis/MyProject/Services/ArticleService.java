package com.infsis.MyProject.Services;
import com.infsis.MyProject.DTOs.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ArticleService {
    List<ArticleDTO> getArticles();
    Optional<ArticleDTO> getArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete(Integer articleId);
}
