package com.infsis.MyProject.Repositories;

import com.infsis.MyProject.Models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
