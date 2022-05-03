
package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dslearnbds.entities.Course;

public class CourseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String imgUri;
	private String imgGrayUri;

	private List<OfferDTO> offers = new ArrayList<>();

	public CourseDTO() {
	}

	public CourseDTO(Long id, String name, String imgUri, String imgGrayUri) {
		super();
		this.id = id;
		this.name = name;
		this.imgUri = imgUri;
		this.imgGrayUri = imgGrayUri;
	}

	public CourseDTO(Course entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.imgUri = entity.getimgUri();
		this.imgGrayUri = entity.getimgGrayUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public String getImgGrayUri() {
		return imgGrayUri;
	}

	public void setImgGrayUri(String imgGrayUri) {
		this.imgGrayUri = imgGrayUri;
	}

	public List<OfferDTO> getOffers() {
		return offers;
	}

}
