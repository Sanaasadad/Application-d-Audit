package com.gestionaudit.repositories;

import com.gestionaudit.entities.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {
}
