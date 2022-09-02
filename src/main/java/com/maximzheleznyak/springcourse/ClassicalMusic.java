package com.maximzheleznyak.springcourse;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

        @Override
    public String getSong() {
        return "Bogemian rapsody";
    }
}
