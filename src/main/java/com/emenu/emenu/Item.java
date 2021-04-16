package com.emenu.emenu;
import javax.persistence.*;
import java.util.Arrays;

@Entity(name = "Item")
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="itID")
    private Integer itID;

    @Column(
            name="it_name",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String it_name;

    @Column(
            name="description",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(
            name="quanity"
    )
    private Integer quanity;

    @Column(
            name="price",
            nullable = false
    )
    private float price;

    @Column(
            name="image",
            nullable = false
    )
    private byte[] image;


    @ManyToOne
    @JoinColumn(name = "ct_id", referencedColumnName = "ctID")
    private Category category;

    public Item(Integer itID, String it_name, String description, Integer quanity, float price, byte[] image,
                Category category) {
        this.itID = itID;
        this.it_name = it_name;
        this.description = description;
        this.quanity = quanity;
        this.price = price;
        this.image = image;
        this.category = category;
    }

    public Integer getItID() {
        return itID;
    }

    public void setItID(Integer itID) {
        this.itID = itID;
    }

    public String getIt_name() {
        return it_name;
    }

    public void setIt_name(String it_name) {
        this.it_name = it_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itID=" + itID +
                ", it_name='" + it_name + '\'' +
                ", description='" + description + '\'' +
                ", quanity=" + quanity +
                ", price=" + price +
                ", image=" + Arrays.toString(image) +
                ", category=" + category +
                '}';
    }
}
