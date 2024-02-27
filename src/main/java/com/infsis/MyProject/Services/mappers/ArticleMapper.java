package com.infsis.MyProject.Services.mappers;

import com.infsis.MyProject.DTOs.ArticleDTO;
import com.infsis.MyProject.Models.Article;

import java.util.Optional;

public class ArticleMapper {
    public ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return  articleDTO;
    }
    public Article DtoToArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setReference(articleDTO.getReference());
        article.setTitle(articleDTO.getTitle());
        return article;
    }
}
