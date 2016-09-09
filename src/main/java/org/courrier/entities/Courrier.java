package org.courrier.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_COURRIER", discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class Courrier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCourrier;
	private String object;
	private String observation;
	private String lienImage;

	public Courrier(Long idCourrier, String object, String observation, String lienImage) {
		super();
		this.idCourrier = idCourrier;
		this.object = object;
		this.observation = observation;
		this.lienImage = lienImage;
	}

	public Courrier(String object, String observation, String lienImage) {
		super();
		this.object = object;
		this.observation = observation;
		this.lienImage = lienImage;
	}

	public Courrier() {
		super();
	}

	public Long getIdCourrier() {
		return idCourrier;
	}

	public void setIdCourrier(Long idCourrier) {
		this.idCourrier = idCourrier;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getLienImage() {
		return lienImage;
	}

	public void setLienImage(String lienImage) {
		this.lienImage = lienImage;
	}

}
