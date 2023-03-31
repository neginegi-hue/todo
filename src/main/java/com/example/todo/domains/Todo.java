package com.example.todo.domains;

import java.sql.Date;

public class Todo {
    private int id;
    private boolean todo;
    private String task;
    private Date limitdate;

    public Todo(int id, boolean todo, String task, Date limitdate) {
        this.id = id;
        this.todo = todo;
        this.task = task;
        this.limitdate = limitdate;
    }

    public Todo(boolean todo, String task, Date limitdate) {
        this.todo = todo;
        this.task = task;
        this.limitdate = limitdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTodo() {
        return todo;
    }

    public void setTodo(boolean todo) {
        this.todo = todo;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getLimitdate() {
        return limitdate;
    }

    public void setLimitdate(Date limitdate) {
        this.limitdate = limitdate;
    }
}
