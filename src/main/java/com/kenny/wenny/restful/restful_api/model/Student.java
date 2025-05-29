package com.kenny.wenny.restful.restful_api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String name;
    private int age;
    private String course;
}
