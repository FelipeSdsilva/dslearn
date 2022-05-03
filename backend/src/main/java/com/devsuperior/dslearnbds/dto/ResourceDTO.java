package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dslearnbds.entities.Resource;
import com.devsuperior.dslearnbds.entities.enums.ResourceType;

public class ResourceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	private ResourceType type;

	private OfferDTO offerDTO;

	private List<SectionDTO> sections = new ArrayList<>();

	public ResourceDTO() {
	}

	public ResourceDTO(Long id, String title, String description, Integer position, String imgUri, ResourceType type,
			OfferDTO offerDTO) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.type = type;
		this.offerDTO = offerDTO;
	}

	public ResourceDTO(Resource entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.description = entity.getDescription();
		this.position = entity.getPosition();
		this.imgUri = entity.getImgUri();
		this.type = entity.getType();

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

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public OfferDTO getOfferDTO() {
		return offerDTO;
	}

	public void setOfferDTO(OfferDTO offerDTO) {
		this.offerDTO = offerDTO;
	}

	public List<SectionDTO> getSections() {
		return sections;
	}

}
