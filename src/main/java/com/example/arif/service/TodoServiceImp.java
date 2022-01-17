package com.example.arif.service;

import com.example.arif.entity.TodoList;
import com.example.arif.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TodoServiceImp implements TodoService{
    @Autowired
    private TodoRepository todoRepository;
    @Override
    public TodoList SaveTodo(TodoList todoList) {
        return todoRepository.save(todoList);
    }

    @Override
    public TodoList fetchTodoListById(Long todoId) {
        return todoRepository.findById(todoId).get();
    }

    @Override
    public List<TodoList> fetchTodoList() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteTodoListById(Long todoId) {
        todoRepository.deleteById(todoId);
    }

    @Override
    public TodoList updateTodoById(Long todoId, TodoList todoList) {
        TodoList db=todoRepository.findById(todoId).get();
        if(Objects.nonNull(todoList.getTodoHeader()) && !"".equalsIgnoreCase(todoList.getTodoHeader())){
            db.setTodoHeader(todoList.getTodoHeader());
        }
        if(Objects.nonNull(todoList.getTodoDescription()) && !"".equalsIgnoreCase(todoList.getTodoDescription())){
            db.setTodoDescription(todoList.getTodoDescription());
        }
        return todoRepository.save(db);
    }


}
