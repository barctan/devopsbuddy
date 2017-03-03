package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Artan on 03/03/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
