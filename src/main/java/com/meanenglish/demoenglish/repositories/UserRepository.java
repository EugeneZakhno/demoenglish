package com.meanenglish.demoenglish.repositories;

import com.meanenglish.demoenglish.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

}
