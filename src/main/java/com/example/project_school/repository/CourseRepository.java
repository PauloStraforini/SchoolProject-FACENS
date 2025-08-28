package com.example.project_school.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.project_school.models.Course;

import jakarta.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void save(Course course) {
        course = entityManager.merge(course);
    }

    public List<Course> getAll(){
        return entityManager.createQuery("from Course", Course.class).getResultList();
    }
}
