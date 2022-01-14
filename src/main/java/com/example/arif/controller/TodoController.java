package com.example.arif.controller;

import com.example.arif.entity.TodoList;
import com.example.arif.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping("/todolist")
    public TodoList SaveTodo(@RequestBody TodoList todoList){
        return  todoService.SaveTodo(todoList);
    }
    @GetMapping("/todolist")
    public List<TodoList> fetchTodoList(){
        return todoService.fetchTodoList();
    }
    @GetMapping("/todolist/{id}")
    public TodoList fetchTodoListById(@PathVariable("id")Long todoId){
        return todoService.fetchTodoListById(todoId);
    }
    @DeleteMapping("/todolist/{id}")
    public String deleteTodoListById(@PathVariable("id")Long todoId){
        todoService.deleteTodoListById(todoId);
        return "deleted successfully";
    }
    @PutMapping("/todolist/{id}")
    public TodoList updateTodoById(@PathVariable("id")Long todoId, @RequestBody TodoList todoList){
        return todoService.updateTodoById(todoId,todoList);
    }
}
