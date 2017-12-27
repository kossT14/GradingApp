package com.register.GradingApp.repository;

import com.register.GradingApp.entities.UserSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cvoinea
 */

@Repository
public interface UserSubjectRepository extends JpaRepository<UserSubject, Long> {

}
