package com.company.models;

public class Affairs {

    private double id;
    private String name;
    private String comment;

    public Affairs(String name, String comment) {
        id = Math.random();
        this.name = name;
        this.comment = comment;
    }

    public double getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
