package com.macnss.repositories;

import com.macnss.entities.Visite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("visiteRepo")
public interface VisiteRepo extends JpaRepository<Visite, Integer> {

}
