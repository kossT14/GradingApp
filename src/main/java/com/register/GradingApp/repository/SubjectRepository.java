package com.register.GradingApp.repository;

import com.register.GradingApp.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cvoinea
 */

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
