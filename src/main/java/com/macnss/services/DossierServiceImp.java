package com.macnss.services;

import com.macnss.entities.Dossier;
import com.macnss.repositories.DossierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Service
public class DossierServiceImp implements DossierService{
    @Qualifier("dossierRepo")
    @Autowired
    private DossierRepo dossierRepo;

    @Override
    @Transactional
    public Dossier createNewDossier(String matricule) {
        Dossier dossier = new Dossier();
        dossier.setMatricule(UUID.fromString(matricule));
        dossier.setPieces(0);
        dossier.setStatus("PEND");
        dossier.setCreatedAt(new Timestamp(new Date().getTime()));
        dossierRepo.save(dossier);
        return dossier;
    }

}
