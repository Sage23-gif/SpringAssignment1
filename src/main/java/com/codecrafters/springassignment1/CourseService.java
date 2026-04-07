package com.codecrafters.springassignment1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public CourseService() {
        courses.add(new Course("CS101", "Introduction to Programming", "Foundation"));
        courses.add(new Course("CS102", "Computer Systems Fundamentals", "Foundation"));
        courses.add(new Course("CS201", "Data Structures", "Undergraduate"));
        courses.add(new Course("CS202", "Database Systems", "Undergraduate"));
        courses.add(new Course("CS401", "Advanced Algorithms", "Honours"));
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Course> getByLevel(String level) {
        return courses.stream()
                .filter(c -> c.getLevel().equalsIgnoreCase(level))
                .collect(Collectors.toList());
    }

    public Course getCourse(String code) {
        return courses.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourse(String code, Course updatedCourse) {
        for (Course c : courses) {
            if (c.getCode().equalsIgnoreCase(code)) {
                c.setName(updatedCourse.getName());
                c.setLevel(updatedCourse.getLevel());
            }
        }
    }

    public void deleteCourse(String code) {
        courses.removeIf(c -> c.getCode().equalsIgnoreCase(code));
    }
}