package com.todo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ubuntu on 02/07/16.
 */
@Controller
@RequestMapping("/todo")
public class TodoListController {

    @RequestMapping("/")
    public String todos (){
        return "todos";
    }

    @RequestMapping("/add")
    public String todoAdd (){
        return "todoAdd";
    }

    @RequestMapping("/view")
    public String todoView(@RequestParam String id){
        return "todoView";
    }

}
