package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String imgUri;
	private String imgGrayUri;
	
	@OneToMany(mappedBy = "course")
	private List<Offer> offers = new ArrayList<>();

	public Course() {
	}

	public Course(Long id, String name, String imgUri, String imgGrayUri) {
		super();
		this.id = id;
		this.name = name;
		this.imgUri = imgUri;
		this.imgGrayUri = imgGrayUri;
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

	public String getimgUri() {
		return imgUri;
	}

	public void setimgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public String getimgGrayUri() {
		return imgGrayUri;
	}

	public void setimgGrayUri(String imgGrayUri) {
		this.imgGrayUri = imgGrayUri;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}

}
