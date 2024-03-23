package com.course.project.repository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.course.project.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface CategoryRepository extends JpaRepository <Category,Integer> {

    Category saveAll(Category cat);


}
