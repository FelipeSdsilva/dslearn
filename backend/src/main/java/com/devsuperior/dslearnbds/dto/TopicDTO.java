package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.devsuperior.dslearnbds.entities.Topic;

public class TopicDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String body;
	private Instant moment;

	private UserDTO author;

	private OfferDTO offerDTO;

	private LessonDTO lesson;

	private ReplyDTO answer;

	private Set<UserDTO> likes = new HashSet<>();

	private List<ReplyDTO> replies = new ArrayList<>();

	public TopicDTO() {
	}

	public TopicDTO(Long id, String title, String body, Instant moment, UserDTO author, OfferDTO offerDTO,
			LessonDTO lesson, ReplyDTO answer) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.moment = moment;
		this.author = author;
		this.offerDTO = offerDTO;
		this.lesson = lesson;
		this.answer = answer;
	}

	public TopicDTO(Topic entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.body = entity.getBody();
		this.moment = entity.getMoment();
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public UserDTO getAuthor() {
		return author;
	}

	public void setAuthor(UserDTO author) {
		this.author = author;
	}

	public OfferDTO getOfferDTO() {
		return offerDTO;
	}

	public void setOfferDTO(OfferDTO offerDTO) {
		this.offerDTO = offerDTO;
	}

	public LessonDTO getLesson() {
		return lesson;
	}

	public void setLesson(LessonDTO lesson) {
		this.lesson = lesson;
	}

	public ReplyDTO getAnswer() {
		return answer;
	}

	public void setAnswer(ReplyDTO answer) {
		this.answer = answer;
	}

	public Set<UserDTO> getLikes() {
		return likes;
	}

	public List<ReplyDTO> getReplies() {
		return replies;
	}
}
