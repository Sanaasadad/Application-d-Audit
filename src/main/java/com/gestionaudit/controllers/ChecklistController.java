package com.gestionaudit.controllers;

import com.gestionaudit.entities.Checklist;
import com.gestionaudit.repositories.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checklists")
public class ChecklistController {

    @Autowired
    private ChecklistRepository checklistRepository;

    // ➕ Ajouter une checklist
    @PostMapping
    public Checklist ajouterChecklist(@RequestBody Checklist checklist) {
        return checklistRepository.save(checklist);
    }

    // 📋 Lister toutes les checklists
    @GetMapping
    public List<Checklist> getAllChecklists() {
        return checklistRepository.findAll();
    }

    // 🗑️ Supprimer une checklist par ID
    @DeleteMapping("/{id}")
    public void supprimerChecklist(@PathVariable Long id) {
        checklistRepository.deleteById(id);
    }
}
