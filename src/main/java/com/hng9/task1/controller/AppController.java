package com.hng9.task1.controller;

import com.hng9.task1.model.AppUser;
import com.hng9.task1.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/task1")
public class AppController {

    private final AppUserService appUserService;

    @GetMapping("/user")
    public ResponseEntity<AppUser> getUser(){
        return ResponseEntity.ok(appUserService.fetchAppUser());
    }
}
