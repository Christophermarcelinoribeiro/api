package com.course.project;

import javax.tools.StandardJavaFileManager.PathFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.project.domain.Category;
import com.course.project.service.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

    @Autowired
    CategoryService service;

    @RequestMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id){
        Category category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }

}
