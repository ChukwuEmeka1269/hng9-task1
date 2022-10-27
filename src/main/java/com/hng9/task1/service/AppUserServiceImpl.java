package com.hng9.task1.service;

import com.hng9.task1.model.AppUser;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService{

    @Override
    public AppUser fetchAppUser() {
        return createAppUser();
    }

    public AppUser createAppUser(){
        return AppUser.builder()
                .age(32)
                .backend(true)
                .bio("A gentle and understanding fun-loving personality with interest in tech. " +
                        "Passionate about learning new things. ")
                .slackUsername("GentleStorm69")
                .build();
    }
}
