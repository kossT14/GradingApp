package com.register.GradingApp.repository;

import com.register.GradingApp.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cvoinea
 */

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
