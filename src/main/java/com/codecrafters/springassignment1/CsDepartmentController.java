package com.codecrafters.springassignment1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CsDepartmentController {

    private final CourseService service;

    public CsDepartmentController(CourseService service) {
        this.service = service;
    }

    // ================= PART A =================
    // Grouped courses (Foundation, Undergraduate, Honours)

    @GetMapping("/department")
    public DepartmentCourses getDepartmentCourses() {
        return new DepartmentCourses(
                service.getByLevel("Foundation"),
                service.getByLevel("Undergraduate"),
                service.getByLevel("Honours")
        );
    }

    // ================= PART B =================
    // CRUD operations

    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @GetMapping("/{code}")
    public Course getCourse(@PathVariable String code) {
        return service.getCourse(code);
    }

    @PostMapping
    public String addCourse(@Valid @RequestBody Course course) {
        service.addCourse(course);
        return "Course added successfully";
    }

    @PutMapping("/{code}")
    public String updateCourse(@PathVariable String code,
                               @Valid @RequestBody Course course) {
        service.updateCourse(code, course);
        return "Course updated successfully";
    }

    @DeleteMapping("/{code}")
    public String deleteCourse(@PathVariable String code) {
        service.deleteCourse(code);
        return "Course deleted successfully";
    }
}