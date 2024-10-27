package org.soap.model;

import jakarta.persistence.*;
import org.soap.enums.Genre;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String prenom;
    private Genre genre;

    public Student( String name, String prenom, Genre genre) {

        this.name = name;
        this.prenom = prenom;
        this.genre = genre;
    }

    public Student() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", genre=" + genre +
                '}';
    }
}
