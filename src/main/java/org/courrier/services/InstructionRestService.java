package org.courrier.services;

import java.util.List;

import org.courrier.entities.Instruction;
import org.courrier.metier.InstructionMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructionRestService {
	
	@Autowired
	InstructionMetier InstructionMetier;

	@RequestMapping(value = "/instructions", method = RequestMethod.POST)
	public Instruction addInstruction(@RequestBody Instruction Instruction) {
		return InstructionMetier.addInstruction(Instruction);
	}

	@RequestMapping(value = "/instructions/{idInstruction}", method = RequestMethod.GET)
	public Instruction getInstruction(@PathVariable Long idInstruction) {
		return InstructionMetier.getInstruction(idInstruction);
	}

	@RequestMapping(value = "/instructions", method = RequestMethod.GET)
	public List<Instruction> allInstructions() {
		return InstructionMetier.allInstructions();
	}

	@RequestMapping(value = "/instructions/{idInstruction}", method = RequestMethod.DELETE)
	public boolean deleteInstruction(@PathVariable Long idInstruction) {
		return InstructionMetier.deleteInstruction(idInstruction);
	}

	@RequestMapping(value = "/instructions", method = RequestMethod.PUT)
	public Instruction updateInstruction(@RequestBody Instruction Instruction) {
		return InstructionMetier.updateInstruction(Instruction);
	}
}
