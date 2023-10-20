package com.licon.api;

import java.io.Serializable;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/10/20 16:35
 */
public class User implements Serializable {

    private String name;


    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
