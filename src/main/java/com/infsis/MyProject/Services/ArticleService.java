package com.infsis.MyProject.Services;
import com.infsis.MyProject.DTOs.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    List<ArticleDTO> getArticles();
    ArticleDTO getArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void delete(Integer articleId);
}
