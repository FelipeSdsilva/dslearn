package com.devsuperior.dslearnbds.dto;

import java.time.Instant;

public class TaskDTO extends LessonDTO {
	private static final long serialVersionUID = 1L;

	private String description;
	private Integer questionCount;
	private Integer approvalCount;
	private Double weight;
	private Instant dueDate;

	public TaskDTO() {
	}

	public TaskDTO(Long id, String title, Integer position, SectionDTO sectionDTO, String description,
			Integer questionCount, Integer approvalCount, Double weight, Instant dueDate) {
		super(id, title, position, sectionDTO);
		this.description = description;
		this.questionCount = questionCount;
		this.approvalCount = approvalCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	public Integer getApprovalCount() {
		return approvalCount;
	}

	public void setApprovalCount(Integer approvalCount) {
		this.approvalCount = approvalCount;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}

}
