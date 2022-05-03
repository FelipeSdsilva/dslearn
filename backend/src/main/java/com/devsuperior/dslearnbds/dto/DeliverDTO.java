package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String uri;
	private Instant moment;
	
	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
	
	private EnrollmentDTO enrollmentDTO;
	
	private LessonDTO lessonDTO;
	
	public DeliverDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public void setStatus(DeliverStatus status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}

	public EnrollmentDTO getEnrollmentDTO() {
		return enrollmentDTO;
	}

	public void setEnrollmentDTO(EnrollmentDTO enrollmentDTO) {
		this.enrollmentDTO = enrollmentDTO;
	}

	public LessonDTO getLessonDTO() {
		return lessonDTO;
	}

	public void setLessonDTO(LessonDTO lessonDTO) {
		this.lessonDTO = lessonDTO;
	}
	
	
}
