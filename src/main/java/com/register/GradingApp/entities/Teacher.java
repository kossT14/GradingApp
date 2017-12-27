package com.register.GradingApp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author cvoinea
 */
@Entity
@DiscriminatorValue("1")
public class Teacher extends User {

    public Teacher() {
    }
}
