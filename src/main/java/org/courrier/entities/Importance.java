package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Importance implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idImportance;
	private String label;

	@OneToMany(mappedBy = "importance", fetch = FetchType.LAZY)
	private Collection<CourrierArriver> courriers;

	protected Importance(Long idImportance, String label) {
		super();
		this.idImportance = idImportance;
		this.label = label;
	}

	protected Importance(String label) {
		super();
		this.label = label;
	}

	protected Importance() {
		super();
	}

	public Long getIdImportance() {
		return idImportance;
	}

	public void setIdImportance(Long idImportance) {
		this.idImportance = idImportance;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
