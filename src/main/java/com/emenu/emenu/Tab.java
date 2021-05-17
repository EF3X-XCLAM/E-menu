package com.emenu.emenu;
import javax.persistence.Table;

import javax.persistence.*;

@Entity(name = "tab")
@Table(name = "tab")
public class Tab {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="tbID")
    private Integer tbID;

    @Column(
            name="number"
    )
    private Integer number;

    @Column(
            name="url",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String url;

    public Integer getTbID() {
        return tbID;
    }

    public void setTbID(Integer tbID) {
        this.tbID = tbID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Tab(Integer tbID, Integer number, String url) {
        this.tbID = tbID;
        this.number = number;
        this.url = url;
    }

    public Tab() {
    }

    @Override
    public String toString() {
        return "Table{" +
                "tbID=" + tbID +
                ", number=" + number +
                ", url='" + url + '\'' +
                '}';
    }
}
