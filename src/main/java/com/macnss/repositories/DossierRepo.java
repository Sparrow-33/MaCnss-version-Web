package com.macnss.repositories;

import com.macnss.entities.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("dossierRepo")
public interface DossierRepo extends JpaRepository<Dossier, Integer> {


}
