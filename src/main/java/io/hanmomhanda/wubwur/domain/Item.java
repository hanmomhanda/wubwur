package io.hanmomhanda.wubwur.domain;

import javax.persistence.*;

/**
 * Created by hanmomhanda on 15. 8. 11.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESC")
    private String description;

    @Column(name = "PRICE")
    private long price;

    @Column(name = "PIC_URL")
    private String pictureUrl;


}
