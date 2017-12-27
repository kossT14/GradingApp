package com.register.GradingApp.entities;

import javax.persistence.*;

/**
 * @author cvoinea
 */
@Entity
@Table(name = "user_subject")
public class UserSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "grade")
    private double grade;

    public UserSubject() {
    }
}
