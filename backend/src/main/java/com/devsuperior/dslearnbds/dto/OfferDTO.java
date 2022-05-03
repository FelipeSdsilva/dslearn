package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dslearnbds.entities.Offer;

public class OfferDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String edition;
	private Instant startMoment;
	private Instant endMoment;
	private CourseDTO courseDTO;

	private List<ResourceDTO> resources = new ArrayList<>();

	private List<TopicDTO> topics = new ArrayList<>();

	public OfferDTO() {
	}

	public OfferDTO(Long id, String edition, Instant startMoment, Instant endMoment, CourseDTO courseDTO) {
		super();
		this.id = id;
		this.edition = edition;
		this.startMoment = startMoment;
		this.endMoment = endMoment;
		this.courseDTO = courseDTO;
	}

	public OfferDTO(Offer entity) {
		this.id = entity.getId();
		this.edition = entity.getEdition();
		this.startMoment = entity.getStartMoment();
		this.endMoment = entity.getEndMoment();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Instant getStartMoment() {
		return startMoment;
	}

	public void setStartMoment(Instant startMoment) {
		this.startMoment = startMoment;
	}

	public Instant getEndMoment() {
		return endMoment;
	}

	public void setEndMoment(Instant endMoment) {
		this.endMoment = endMoment;
	}

	public CourseDTO getCourseDTO() {
		return courseDTO;
	}

	public void setCourseDTO(CourseDTO courseDTO) {
		this.courseDTO = courseDTO;
	}

	public List<ResourceDTO> getResources() {
		return resources;
	}

	public List<TopicDTO> getTopics() {
		return topics;
	}

}
