package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.devsuperior.dslearnbds.entities.Reply;

public class ReplyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String body;
	private Instant moment;
	private TopicDTO topic;

	private UserDTO author;

	private Set<UserDTO> likes = new HashSet<>();

	public ReplyDTO() {
	}

	public ReplyDTO(Long id, String body, Instant moment, TopicDTO topic, UserDTO author) {
		super();
		this.id = id;
		this.body = body;
		this.moment = moment;
		this.topic = topic;
		this.author = author;
	}

	public ReplyDTO(Reply entity) {
		this.id = entity.getId();
		this.body = entity.getBody();
		this.moment = entity.getMoment();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TopicDTO getTopic() {
		return topic;
	}

	public void setTopic(TopicDTO topic) {
		this.topic = topic;
	}

	public UserDTO getAuthor() {
		return author;
	}

	public void setAuthor(UserDTO author) {
		this.author = author;
	}

	public Set<UserDTO> getLikes() {
		return likes;
	}

}
