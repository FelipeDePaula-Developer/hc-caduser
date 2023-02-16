package com.healthcare.cadusers.entities;

import jakarta.persistence.*;

@Entity(name = "credentials")
public class Credential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcredential;
    @Column
    private String login;
    @Column
    private String password;
    @Column(columnDefinition = "CHAR default 'T'", length = 1, nullable = false)
    private String logged;
    @Column(columnDefinition = "CHAR default 'T'", length = 1, nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "iddoctor", referencedColumnName = "iddoctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "iduser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idclient", referencedColumnName = "idclient")
    private Client client;

    public Credential() {
    }

    public Credential(String login, String password, String logged, String status, Doctor doctor, User user, Client client) {
        this.login = login;
        this.password = password;
        this.logged = logged;
        this.status = status;
        this.doctor = doctor;
        this.user = user;
        this.client = client;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogged() {
        return logged;
    }

    public void setLogged(String logged) {
        this.logged = logged;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
