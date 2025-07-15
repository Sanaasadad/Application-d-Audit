package com.gestionaudit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String site;
    private String service;
    private String date;
    private String norme;
    private String statut;

    @OneToMany(mappedBy = "audit")
    private List<Checklist> checklists;
    public Audit() {}

    public Long getId() {
        return id; }
    public void setId(Long id) {
        this.id = id; }

    public String getSite() {
        return site; }
    public void setSite(String site) {
        this.site = site; }

    public String getService() {
        return service; }
    public void setService(String service) {
        this.service = service; }

    public String getDate() {
        return date; }
    public void setDate(String date) {
        this.date = date; }

    public String getNorme() {
        return norme; }
    public void setNorme(String norme) {
        this.norme = norme; }

    public String getStatut() {
        return statut; }
    public void setStatut(String statut) {
        this.statut = statut; }
}

