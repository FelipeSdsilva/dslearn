package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.devsuperior.dslearnbds.entities.Lesson;

public abstract class LessonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Integer position;

	private SectionDTO sectionDTO;

	private Set<EnrollmentDTO> enrollmentsDone = new HashSet<>();

	private List<DeliverDTO> deliveries = new ArrayList<>();

	private List<TopicDTO> topics = new ArrayList<>();

	public LessonDTO() {
	}

	public LessonDTO(Long id, String title, Integer position, SectionDTO sectionDTO) {
		super();
		this.id = id;
		this.title = title;
		this.position = position;
		this.sectionDTO = sectionDTO;
	}

	public LessonDTO(Lesson entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.position = entity.getPosition();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public SectionDTO getSectionDTO() {
		return sectionDTO;
	}

	public void setSectionDTO(SectionDTO sectionDTO) {
		this.sectionDTO = sectionDTO;
	}

	public Set<EnrollmentDTO> getEnrollmentsDone() {
		return enrollmentsDone;
	}

	public List<DeliverDTO> getDeliveries() {
		return deliveries;
	}

	public List<TopicDTO> getTopics() {
		return topics;
	}

}
