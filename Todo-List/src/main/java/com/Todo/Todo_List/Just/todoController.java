package com.Todo.Todo_List.Just;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Too")

public class todoController {
    private  final todoService  todoservice;


    public todoController(todoService todoservice) {
        this.todoservice = todoservice;
    }
    @GetMapping
    public List<todo> getToo(){
        return todoservice.getAlltodoes();


    }
}
