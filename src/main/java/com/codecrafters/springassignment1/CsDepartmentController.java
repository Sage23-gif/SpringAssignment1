package com.codecrafters.springassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CsDepartmentController {

    @GetMapping("/department")
    public DepartmentCourses getDepartmentCourses() {
        return new DepartmentCourses(
                getFoundationCourses(),
                getUndergraduateCourses(),
                getHonoursCourses()
        );
    }

    private List<Course> getFoundationCourses() {
        return Arrays.asList(
                new Course("CS101", "Introduction to Programming", "Foundation"),
                new Course("CS102", "Computer Systems Fundamentals", "Foundation")
        );
    }

    private List<Course> getUndergraduateCourses() {
        return Arrays.asList(
                new Course("CS201", "Data Structures and Algorithms", "Undergraduate"),
                new Course("CS202", "Database Systems", "Undergraduate"),
                new Course("CS203", "Operating Systems", "Undergraduate"),
                new Course("CS204", "Software Engineering", "Undergraduate"),
                new Course("CS205", "Computer Networks", "Undergraduate")
        );
    }

    private List<Course> getHonoursCourses() {
        return Arrays.asList(
                new Course("CS401", "Advanced Algorithms", "Honours"),
                new Course("CS402", "Artificial Intelligence", "Honours"),
                new Course("CS403", "Machine Learning", "Honours"),
                new Course("CS404", "Cloud Computing", "Honours")
        );
    }
}