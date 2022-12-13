package com.macnss.services;

import com.macnss.entities.Visite;
import com.macnss.repositories.VisiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VisiteServiceImp implements VisiteService{
    @Qualifier("visiteRepo")
    @Autowired
    private VisiteRepo visiteRepo;

    @Override
    @Transactional
    public void NewVisite(int dossierID, Double tarif, Integer code) {

        Visite visite = new Visite();
        visite.setDossier(dossierID);
        visite.setTarif(tarif);
        visite.setCode(code);

        visiteRepo.save(visite);
    }
}
