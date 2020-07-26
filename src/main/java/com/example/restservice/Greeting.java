package com.example.restservice;

//Resource representation class to model the greeting representation
public class Greeting {

    private final long id; //Unique identifier for the greeting
    private final String content; //Textual representation for the greeting

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
