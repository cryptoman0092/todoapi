package com.example.arif.service;

import com.example.arif.entity.TodoList;

import java.util.List;

public interface TodoService {
    public TodoList SaveTodo(TodoList todoList);

    public TodoList fetchTodoListById(Long todoId);

    public List<TodoList> fetchTodoList();

    public void deleteTodoListById(Long todoId);

    public TodoList updateTodoById(Long todoId, TodoList todoList);
}
