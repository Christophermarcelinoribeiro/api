package com.course.project.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.NativeQuery.ReturnProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.project.domain.Category;
import com.course.project.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Integer id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }

}
