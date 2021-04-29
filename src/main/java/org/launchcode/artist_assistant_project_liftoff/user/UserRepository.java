package org.launchcode.artist_assistant_project_liftoff.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{

//    User findById(Integer userId);

}
