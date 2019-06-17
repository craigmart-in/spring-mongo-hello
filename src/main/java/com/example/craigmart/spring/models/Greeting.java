package com.example.craigmart.spring.models;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting() {
        this.id = -1;
        content = "";
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
