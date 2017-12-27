package com.register.GradingApp.repository;

import com.register.GradingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cvoinea
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
