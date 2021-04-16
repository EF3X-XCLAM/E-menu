package com.emenu.emenu;
import javax.persistence.*;
import java.util.List;

@Entity(name = "Category")
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ctID")
    private Integer ctID;

    @Column(
            name="ct_name",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String ct_name;


    @OneToMany(mappedBy = "category")
    private List<Item> item;

    public Category(Integer ctID, String ct_name) {
        this.ctID = ctID;
        this.ct_name = ct_name;
    }

    public Category() {
    }

    public Integer getCtID() {
        return ctID;
    }

    public void setCtID(Integer ctID) {
        this.ctID = ctID;
    }

    public String getCt_name() {
        return ct_name;
    }

    public void setCt_name(String ct_name) {
        this.ct_name = ct_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "ctID=" + ctID +
                ", ct_name='" + ct_name + '\'' +
                '}';
    }
}
