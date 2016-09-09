package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Instruction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstruction;
	private String label;

	@ManyToMany(mappedBy = "instructions", fetch = FetchType.LAZY)
	private Collection<CourrierArriver> courriers;

	protected Instruction(Long idInstruction, String label) {
		super();
		this.idInstruction = idInstruction;
		this.label = label;
	}

	protected Instruction(String label) {
		super();
		this.label = label;
	}

	protected Instruction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdInstruction() {
		return idInstruction;
	}

	public void setIdInstruction(Long idInstruction) {
		this.idInstruction = idInstruction;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@JsonIgnore
	public Collection<CourrierArriver> getCourriers() {
		return courriers;
	}

	@JsonSetter
	public void setCourriers(Collection<CourrierArriver> courriers) {
		this.courriers = courriers;
	}

}
