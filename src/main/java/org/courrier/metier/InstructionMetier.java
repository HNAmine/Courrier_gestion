package org.courrier.metier;

import java.util.List;

import org.courrier.entities.Instruction;

public interface InstructionMetier {
	public Instruction addInstruction(Instruction Instruction);

	public Instruction getInstruction(Long idInstruction);

	public List<Instruction> allInstructions();

	public Instruction updateInstruction(Instruction Instruction);

	public boolean deleteInstruction(Long idInstruction);
}
