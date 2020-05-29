package com.meanenglish.demoenglish.repositories;

import com.meanenglish.demoenglish.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
    @Override
    default Optional<User> findById(Long aLong){
        return Optional.empty();
    }
}
