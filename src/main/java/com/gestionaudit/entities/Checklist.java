package com.gestionaudit.entities;

import jakarta.persistence.*;

@Entity
public class Checklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String point;         // Point de contrôle
    private String statut;        // conforme / non conforme
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "audit_id")
    private Audit audit;

    public Checklist() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPoint() { return point; }
    public void setPoint(String point) { this.point = point; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }


}
