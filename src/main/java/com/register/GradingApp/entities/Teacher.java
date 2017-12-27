package com.register.GradingApp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author cvoinea
 */
@Entity
@Table(name = "teacher")
@DiscriminatorValue("1")
public class Teacher extends User {

    public Teacher() {
    }
}
