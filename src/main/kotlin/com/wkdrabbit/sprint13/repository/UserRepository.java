package com.wkdrabbit.sprint13.repository;


import com.wkdrabbit.sprint13.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
