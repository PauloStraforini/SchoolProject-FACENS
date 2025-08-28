package com.example.project_school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.project_school.models.Course;
import com.example.project_school.repository.CourseRepository;

@SpringBootApplication
public class ProjectSchoolApplication {

    @Autowired
    private CourseRepository courseRepository;

    @Bean
    public CommandLineRunner init() {
        return args -> {
            courseRepository.save(new Course(null, "teste 1", 2000));
            courseRepository.save(new Course(null, "teste 2", 2000));
			courseRepository.save(new Course(null, "teste 3", 2000));
			courseRepository.save(new Course(null, "teste 4", 2000));
			courseRepository.save(new Course(null, "teste 5", 2000));
			
            List<Course> listCourse = courseRepository.getAll();
            listCourse.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectSchoolApplication.class, args);
    }
}
