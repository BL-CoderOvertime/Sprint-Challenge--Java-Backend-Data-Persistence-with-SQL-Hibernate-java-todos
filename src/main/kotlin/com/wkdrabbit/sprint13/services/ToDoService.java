package com.wkdrabbit.sprint13.services;

import com.wkdrabbit.sprint13.models.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> findAll();

    List<ToDo> findAllByUserId(long id);

    ToDo findTodoById(long id);

    void delete(long id);

    ToDo save(ToDo todo);
}
