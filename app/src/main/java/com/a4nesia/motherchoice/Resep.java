package com.a4nesia.motherchoice;

/**
 * Created by Dhian on 02/05/2017.
 */

public class Resep {

    private String name;
    private String week;
    private Boolean done;

    public Resep(String name, String week) {
        this.name = name;
        this.week = week;
        done = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
