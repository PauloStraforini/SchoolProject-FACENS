package com.example.project_school.repository;

import com.example.project_school.models.CourseCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseCategoryRepository {

    private final List<CourseCategory> categories = new ArrayList<>();

    public List<CourseCategory> getAll() {
        return new ArrayList<>(categories);
    }

    public CourseCategory insert(CourseCategory category) {
        categories.add(category);
        return category;
    }

    public List<CourseCategory> getByName(String name) {
        return categories.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public CourseCategory update(CourseCategory category) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId().equals(category.getId())) {
                categories.set(i, category);
                return category;
            }
        }
        return null; // or throw exception
    }

    public void deleteById(int id) {
        categories.removeIf(c -> c.getId().equals(id));
    }

    public void delete(CourseCategory category) {
        categories.removeIf(c -> c.equals(category));
    }
}