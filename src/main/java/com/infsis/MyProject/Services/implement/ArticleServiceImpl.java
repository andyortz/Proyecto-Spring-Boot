package com.infsis.MyProject.Services.implement;

import com.infsis.MyProject.DTOs.ArticleDTO;
import com.infsis.MyProject.Models.Article;
import com.infsis.MyProject.Services.ArticleService;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    @Override
    public List<ArticleDTO> getArticles(){
        return null;
    }
    @Override
    public ArticleDTO getArticleById(Integer articleId){
        return null;
    }
    @Override
    public  ArticleDTO saveArticle(ArticleDTO articleDTO){
        return articleDTO;
    }
    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO){
        return articleDTO;
    }
    @Override
    public void delete(Integer userId){

    }
    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return  articleDTO;
    }
    private Article DtoToArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setReference(articleDTO.getReference());
        article.setTitle(articleDTO.getTitle());
        return article;
    }
}
