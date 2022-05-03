package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dslearnbds.entities.Section;

public class SectionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;

	private ResourceDTO resource;

	private SectionDTO prerequisite;

	private List<LessonDTO> lessons = new ArrayList<>();

	public SectionDTO() {
	}

	public SectionDTO(Long id, String title, String description, Integer position, String imgUri, ResourceDTO resource,
			SectionDTO prerequisite) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.resource = resource;
		this.prerequisite = prerequisite;
	}

	public SectionDTO(Section entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.description = entity.getDescription();
		this.position = entity.getPosition();
		this.imgUri = entity.getImgUri();

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public ResourceDTO getResource() {
		return resource;
	}

	public void setResource(ResourceDTO resource) {
		this.resource = resource;
	}

	public SectionDTO getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(SectionDTO prerequisite) {
		this.prerequisite = prerequisite;
	}

	public List<LessonDTO> getLessons() {
		return lessons;
	}
}
