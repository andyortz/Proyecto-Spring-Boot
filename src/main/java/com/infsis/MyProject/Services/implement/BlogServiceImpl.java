package com.infsis.MyProject.Services.implement;

import com.infsis.MyProject.DTOs.BlogDTO;
import com.infsis.MyProject.Models.Blog;
import com.infsis.MyProject.Services.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public List<BlogDTO>  getBlogs(){
        return null;
    }
    @Override
    public BlogDTO getBlogById(Integer blogId){
        return null;
    }
    @Override
    public  BlogDTO saveBlog(BlogDTO blogDTO){
        return blogDTO;
    }
    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO){
        return blogDTO;
    }
    @Override
    public void delete(Integer blogId){

    }
    private BlogDTO BlogtoDto(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getId(),
                blog.getName()
        );
        return  blogDTO;
    }
    private Blog DtoToBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());
        return blog;
    }

}
