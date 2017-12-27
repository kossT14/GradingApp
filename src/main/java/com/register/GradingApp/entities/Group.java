package com.register.GradingApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author cvoinea
 */
@Entity
@Table(name = "group")
public class Group {

    public enum Domain {
        CTI, ETTI, ETC
    }

    public enum Series {
        A, B, C, D, E, F, G
    }

    public enum YearOfStudy {
        ONE(1), TWO(2), THREE(3), FOUR(4);

        public int yearAsInt;

        YearOfStudy(int yearAsInt) {
            this.yearAsInt = yearAsInt;
        }

        public int getYearAsInt() {
            return yearAsInt;
        }
    }

    public enum Specialization {
        INF, ELA, TST, RST, MON, ELAen, TSTen
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Enumerated(EnumType.STRING)
    private YearOfStudy yearOfStudy;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @Enumerated(EnumType.STRING)
    private Series series;

    @Enumerated(EnumType.STRING)
    private Domain domain;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group", cascade = CascadeType.ALL)
    private Set<User> users;

    public Group() {
    }

    public Group(YearOfStudy yearOfStudy, Specialization specialization, Series series, Domain domain) {
        this.yearOfStudy = yearOfStudy;
        this.specialization = specialization;
        this.series = series;
        this.domain = domain;
        this.name = new StringBuilder()
                .append(4)
                .append(this.yearOfStudy.getYearAsInt())
                .append(this.specialization.toString())
                .append(this.series.toString())
                .append("-")
                .append(this.domain.toString())
                .toString();
    }

    public long getId() {
        return id;
    }

    public YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public Series getSeries() {
        return series;
    }

    public Domain getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
