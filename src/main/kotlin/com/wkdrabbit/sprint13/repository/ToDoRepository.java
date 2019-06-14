package com.wkdrabbit.sprint13.repository;

import com.wkdrabbit.sprint13.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository  extends CrudRepository<ToDo, Long> {
}
