package com.example.frontend;

import java.io.Serializable;

public class Post implements Serializable {

 private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}