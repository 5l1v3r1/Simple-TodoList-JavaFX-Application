package com.haxtivitiez.todolist.datamodel;

import java.time.LocalDate;

/**
 * Created by UN4CKN0WL3Z on 30/10/2017.
 */
public class TodoItem {

    private String shortDescription;
    private String details;
    private LocalDate deadline;


    public TodoItem(String shortDescription, String details, LocalDate deadline) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadline = deadline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

//    @Override
//    public String toString() {
//        return shortDescription ;
//    }
}
