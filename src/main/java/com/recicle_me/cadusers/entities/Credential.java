package com.recicle_me.cadusers.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCredential;

    @Column
    private String login;

    @Column
    private String password;

    @Column(nullable = false)
    private String salt;

    @Column(columnDefinition = "CHAR(1) default 'T'", length = 1, nullable = false)
    private String status = "T";

    @Column(columnDefinition = "CHAR(1) default 'F'", length = 1)
    private String logged;

    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    private User user;
}
