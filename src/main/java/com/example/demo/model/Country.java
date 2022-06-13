package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue
    public int id;
    @Column(name="name")
    public String name;
    @Column(name = "meta_code")
    public String meta_code;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String meta_data() {
        return meta_code;
    }

    public void setMeta_data(String meta_data) {
        this.meta_code = meta_code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meta_data='" + meta_code + '\'' +
                '}';
    }
}
