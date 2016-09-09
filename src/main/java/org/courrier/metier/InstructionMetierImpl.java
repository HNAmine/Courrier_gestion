package org.courrier.metier;

import java.util.List;

import org.courrier.dao.InstructionRepository;
import org.courrier.entities.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructionMetierImpl implements InstructionMetier {

	@Autowired
	InstructionRepository InstructionRepository;

	@Override
	public Instruction addInstruction(Instruction Instruction) {
		return InstructionRepository.save(Instruction);
	}

	@Override
	public Instruction getInstruction(Long idInstruction) {
		return InstructionRepository.findOne(idInstruction);
	}

	@Override
	public List<Instruction> allInstructions() {
		return InstructionRepository.findAll();
	}

	@Override
	public Instruction updateInstruction(Instruction Instruction) {
		return InstructionRepository.saveAndFlush(Instruction);
	}

	@Override
	public boolean deleteInstruction(Long idInstruction) {
		InstructionRepository.delete(idInstruction);
		return true;
	}
}
