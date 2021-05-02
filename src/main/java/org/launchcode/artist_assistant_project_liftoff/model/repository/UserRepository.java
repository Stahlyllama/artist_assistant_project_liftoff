package org.launchcode.artist_assistant_project_liftoff.model.repository;

import org.launchcode.artist_assistant_project_liftoff.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

//    User findById(Integer userId);

}
