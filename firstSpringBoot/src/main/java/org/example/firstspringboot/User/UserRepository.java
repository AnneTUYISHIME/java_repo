package org.example.firstspringboot.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class UserRepository {


    @Repository
    public interface TaskRepository extends JpaRepository<User, Long> {
    }
}
