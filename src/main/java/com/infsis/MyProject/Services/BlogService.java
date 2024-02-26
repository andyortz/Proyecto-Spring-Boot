package com.infsis.MyProject.Services;
import com.infsis.MyProject.DTOs.BlogDTO;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface BlogService {
    List<BlogDTO> getBlogs();
    BlogDTO getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
