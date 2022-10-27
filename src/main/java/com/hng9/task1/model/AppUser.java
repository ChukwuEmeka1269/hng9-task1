package com.hng9.task1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser {
    private String slackUsername;
    private Boolean backend;
    private Integer age;
    private String bio;
}
