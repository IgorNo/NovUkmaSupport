package com.ukmaSupport.models;

import java.io.Serializable;


public class Auditorium implements Serializable {
    private long id;
    private User user;
    private String number;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public User getUserId() {
        return user;
    }
    public void setUserId(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Auditorium{" +
                "id=" + id +
                ", userId=" + user +
                ", number='" + number + '\'' +
                '}';
    }
}
