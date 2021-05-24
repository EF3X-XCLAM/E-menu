package com.emenu.emenu;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="orID")
    private Integer orID;

    @Column(
            name="grandtotal",
            nullable = false
    )
    private float grandtotal;

    @Column(
            name="date",
            nullable = false
    )
    private LocalDate date;




}
