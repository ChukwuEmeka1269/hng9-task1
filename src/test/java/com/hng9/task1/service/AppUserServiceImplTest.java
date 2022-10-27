package com.hng9.task1.service;

import com.hng9.task1.model.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserServiceImplTest {

    private  AppUserServiceImpl appUserService;

    @BeforeEach
    void setUp(){
        appUserService = new AppUserServiceImpl();
    }

    @Test
    void fetchAppUser() {
        //Given
        int expectedAge = 32;
        //when
        AppUser appUser = appUserService.fetchAppUser();
        int actualAge = appUser.getAge();
        //Then
        assertEquals(expectedAge, actualAge);
    }

}