package com.ukmaSupport.models;

import java.io.Serializable;
import java.sql.Timestamp;

public class Order implements Serializable {
    private long id;
    private User user;
    private User assistant;
    private Workplace workplace;
    private String title;
    private String content;
    private Timestamp createdAt;
    private String status;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }
    public void setUserId(User user) {
        this.user = user;
    }

    public User getAssistantId() {
        return assistant;
    }
    public void setAssistantId(User assistant) {
        this.assistant = assistant;
    }

    public Workplace getWorkplace() {
        return workplace;
    }
    public void setWorkplace(Workplace workplace) {
        this.workplace = workplace;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user.getEmail() +
                ", assistantId=" + assistant.getEmail() +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", status='" + status + '\'' +
                '}';
    }
}