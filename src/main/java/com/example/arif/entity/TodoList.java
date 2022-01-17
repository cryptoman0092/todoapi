package com.example.arif.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="todo_list")
public class TodoList {
    @Id
    @SequenceGenerator(name="todo_sequence",
    sequenceName="todo_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "todo_sequence")
    private Long todoId;
    @NotBlank(message = "please add todo header")
    private String todoHeader;
    @NotBlank(message = "please add todo description")
    private String todoDescription;

}
