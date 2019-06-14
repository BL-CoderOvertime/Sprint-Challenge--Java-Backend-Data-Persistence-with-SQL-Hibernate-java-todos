package com.wkdrabbit.sprint13.services;

import com.wkdrabbit.sprint13.models.ToDo;
import com.wkdrabbit.sprint13.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "todoService")
public class TodoServiceImpl implements ToDoService {

    @Autowired
    ToDoRepository todorepos;

    @Override
    public List<ToDo> findAll() {
        List<ToDo> list = new ArrayList<>();
        todorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<ToDo> findAllByUserId(long id) {
        List<ToDo> listAll = findAll();
        List<ToDo> listSelected = findAll();
        for(ToDo todo : listAll){
            if(todo.getUser().getUserid() == id)
            {
                listSelected.add(todo);
            }
        }
        return listSelected;
    }

    @Override
    public ToDo findTodoById(long id) {
        return todorepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public void delete(long id) {
        todorepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
        todorepos.deleteById(id);
    }

    @Transactional
    @Override
    public ToDo save(ToDo todo) {
        return todorepos.save(todo);
    }
}
