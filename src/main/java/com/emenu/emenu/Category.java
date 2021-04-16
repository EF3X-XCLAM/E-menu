package com.emenu.emenu;
import javax.persistence.*;
import java.util.List;

@Entity(name = "Category")
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ctID")
    private Long ctID;

    @Column(
            name="ct_name",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String ct_name;


    @OneToMany(mappedBy = "category")
    private List<Item> item;

    public Category(Long ctID, String ct_name) {
        this.ctID = ctID;
        this.ct_name = ct_name;
    }

    public Long getCtID() {
        return ctID;
    }

    public void setCtID(Long ctID) {
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
