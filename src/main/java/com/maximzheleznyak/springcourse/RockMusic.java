package com.maximzheleznyak.springcourse;


import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Fear of the Dark";
    }
}
