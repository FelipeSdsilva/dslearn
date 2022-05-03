package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.devsuperior.dslearnbds.dto.pk.EnrollmentDTOPK;
import com.devsuperior.dslearnbds.entities.Enrollment;

public class EnrollmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private EnrollmentDTOPK id;
	private Instant enrollMoment;
	private Instant refoundMoment;
	private boolean available;
	private boolean onlyUpdate;

	private Set<LessonDTO> lessonsDone = new HashSet<>();

	private List<DeliverDTO> deliveries = new ArrayList<>();

	public EnrollmentDTO() {

	}

	public EnrollmentDTO(UserDTO userDTO, OfferDTO OfferDTO, Instant enrollMoment, Instant refoundMoment,
			boolean available, boolean onlyUpdate) {
		super();
		id.setUserDTO(userDTO);
		id.setOfferDTO(OfferDTO);
		this.enrollMoment = enrollMoment;
		this.refoundMoment = refoundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	public EnrollmentDTO(Enrollment entity) {
		
	}

	public EnrollmentDTOPK getId() {
		return id;
	}

	public void setId(EnrollmentDTOPK id) {
		this.id = id;
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefoundMoment() {
		return refoundMoment;
	}

	public void setRefoundMoment(Instant refoundMoment) {
		this.refoundMoment = refoundMoment;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}

	public Set<LessonDTO> getLessonsDone() {
		return lessonsDone;
	}

	public List<DeliverDTO> getDeliveries() {
		return deliveries;
	}

}
