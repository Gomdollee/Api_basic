package com.example.filter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성장
@AllArgsConstructor //전체생성자
public class User {
    private String name;
    private int age;
}
