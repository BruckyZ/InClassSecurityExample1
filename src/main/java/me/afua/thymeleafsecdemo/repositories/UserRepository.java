package me.afua.thymeleafsecdemo.repositories;

import me.afua.thymeleafsecdemo.entities.UserData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserData,Long> {
    UserData findByUsername(String username);

    Iterable <UserData> findByUsernameOrderBy(String username);
}
