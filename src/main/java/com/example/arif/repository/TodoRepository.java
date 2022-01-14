package com.example.arif.repository;

import com.example.arif.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoList,Long> {
}
