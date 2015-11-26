package com.ukmaSupport.models;

import java.io.Serializable;

public class Workplace implements Serializable {
    private long id;
    private Auditorium auditorium;
    private int accessNumber;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getAccessNumber() {
        return accessNumber;
    }
    public void setAccessNumber(int accessNumber) {
        this.accessNumber = accessNumber;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }
    public void setAuditoriumId(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @Override
    public String toString() {
        return "Workplace{" +
                "id=" + id +
                ", auditorium=" + auditorium +
                ", accessNumber=" + accessNumber +
                '}';
    }
}
