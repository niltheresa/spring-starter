package com.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ubuntu on 04/07/16.
 */
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Todo[id=%d, name='%s', description='%s']", id,
                name, description);
    }

}
