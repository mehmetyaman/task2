package com.codefirstio.codefirsthelloworld;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isim")
    private String isim;

    @Column(name = "soyisim")
    private String soyisim;
}
