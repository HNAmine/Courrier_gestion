package org.courrier.dao;

import org.courrier.entities.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instruction, Long>{

}
