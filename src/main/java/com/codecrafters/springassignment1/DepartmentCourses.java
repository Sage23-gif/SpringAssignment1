package com.codecrafters.springassignment1;

import java.util.List;

public class DepartmentCourses {

    private List<Course> foundationCourses;
    private List<Course> undergraduateCourses;
    private List<Course> honoursCourses;

    public DepartmentCourses(List<Course> foundationCourses,
                             List<Course> undergraduateCourses,
                             List<Course> honoursCourses) {

        this.foundationCourses = foundationCourses;
        this.undergraduateCourses = undergraduateCourses;
        this.honoursCourses = honoursCourses;
    }

    public List<Course> getFoundationCourses() {
        return foundationCourses;
    }

    public List<Course> getUndergraduateCourses() {
        return undergraduateCourses;
    }

    public List<Course> getHonoursCourses() {
        return honoursCourses;
    }
}