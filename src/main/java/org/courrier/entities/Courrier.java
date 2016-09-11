package org.courrier.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_COURRIER", discriminatorType = DiscriminatorType.STRING, length = 2)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(name = "CA", value = CourrierArriver.class), @Type(name = "CD", value = CourrierDepart.class) })
public abstract class Courrier implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCourrier;
	private String object;
	private String observation;
	private String lienImage;

	@OneToMany(mappedBy = "courrier")
	private Collection<Affecter> affecters;
	
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

	@JsonIgnore
	public Collection<Affecter> getAffecters() {
		return affecters;
	}

	@JsonSetter
	public void setAffecters(Collection<Affecter> affecters) {
		this.affecters = affecters;
	}

}
