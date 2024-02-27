package com.infsis.MyProject.Services.implement;

import com.infsis.MyProject.DTOs.ArticleDTO;
import com.infsis.MyProject.Repositories.ArticleRepository;
import com.infsis.MyProject.Services.ArticleService;
import com.infsis.MyProject.Services.mappers.ArticleMapper;

import java.util.List;
import java.util.Optional;
//try
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;
    public ArticleServiceImpl(ArticleRepository articleRepository, ArticleMapper articleMapper){
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }
    @Override
    public List<ArticleDTO> getArticles(){
        return articleRepository.findAll().stream().map(articleMapper::ArticletoDto).toList();
    }
    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId){
        return articleRepository.findById(articleId).map(articleMapper::ArticletoDto);
    }
    @Override
    public  ArticleDTO saveArticle(ArticleDTO articleDTO){
        return articleMapper.ArticletoDto(articleRepository.save(articleMapper.DtoToArticle(articleDTO)));
    }
    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO){
        return articleMapper.ArticletoDto(articleRepository.save(articleMapper.DtoToArticle(articleDTO)));
    }
    @Override
    public void delete(Integer articleId){
        articleRepository.deleteById(articleId);
    }

}
