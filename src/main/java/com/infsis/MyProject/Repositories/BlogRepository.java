package com.infsis.MyProject.Repositories;

import com.infsis.MyProject.Models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
