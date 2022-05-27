package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="industry")
public class Industry {
    @Id
    @GeneratedValue
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "meta_data")
    public String meta_data;

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
        return meta_data;
    }

    public void setMeta_data(String meta_data) {
        this.meta_data = meta_data;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meta_data='" + meta_data + '\'' +
                '}';
    }
}
