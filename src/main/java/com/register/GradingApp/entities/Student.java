package com.register.GradingApp.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author cvoinea
 */

@Entity
@Table(name = "student")
@DiscriminatorValue("2")
public class Student extends User {

    @Column(name = "group")
    private Group group;

    @Column(name = "enrollment_year")
    private int enrollmentYear;

    @Column(name = "graduation_year")
    private int graduationYear;

    public Student() {
    }
}
