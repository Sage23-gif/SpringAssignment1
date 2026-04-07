package com.codecrafters.springassignment1;

import jakarta.validation.constraints.NotBlank;

public class Course {

    @NotBlank(message = "Code is required")
    private String code;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Level is required")
    private String level;

    public Course() {}

    public Course(String code, String name, String level) {
        this.code = code;
        this.name = name;
        this.level = level;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}