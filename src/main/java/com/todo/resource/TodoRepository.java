package com.todo.resource;

import com.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* Created by ubuntu on 04/07/16.
*/
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
