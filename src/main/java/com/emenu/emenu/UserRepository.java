package com.emenu.emenu;

/*import io.javabrains.springsecurityjpa.models.User;*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Optional<User> findByUserName(String userName);
    //@Query("SELECT email FROM admin WHERE email = ?1")
    public User findByEmail(String email);
}