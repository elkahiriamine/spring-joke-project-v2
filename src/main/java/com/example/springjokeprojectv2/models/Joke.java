package com.example.springjokeprojectv2.models;

import java.io.Serializable;

public class Joke implements Serializable {
    private String joke;

    public Joke() {
    }

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
