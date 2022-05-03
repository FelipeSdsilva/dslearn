package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Content;

public class ContentDTO extends LessonDTO {
	private static final long serialVersionUID = 1L;

	private String textContent;
	private String videoUri;

	@SuppressWarnings("unused")
	private ContentDTO() {
	}

	public ContentDTO(Long id, String title, Integer position, SectionDTO sectionDTO, String textContent,
			String videoUri) {
		super(id, title, position, sectionDTO);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}
	
	public ContentDTO(Content Entity) {
		
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

}
