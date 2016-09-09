package org.courrier.dao;

import org.courrier.entities.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourrierRepository extends JpaRepository<Courrier, Long>{

}
