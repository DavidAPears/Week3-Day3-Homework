package models;

import javax.persistence.*;

@Entity
@Table(name = "courses")



public class Course {

    private int id;
    private String title;
    private String level;

    public Course() {}

    public Course(String title, String level) {
        this.title = title;
        this.level = level;
    }

//   ID Getter & Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    TITLE Getter & Setter:

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    LEVEL Getter & Setter:

    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}


