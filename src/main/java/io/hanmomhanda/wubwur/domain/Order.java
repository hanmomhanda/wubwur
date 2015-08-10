package io.hanmomhanda.wubwur.domain;

import javax.persistence.*;

/**
 * Created by hanmomhanda on 15. 8. 11.
 */
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Item item;

    @Column(name = "DLVR_ADDR")
    private String deliveryAddress;

}
