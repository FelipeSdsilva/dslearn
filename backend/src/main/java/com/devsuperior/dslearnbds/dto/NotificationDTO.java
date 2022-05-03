package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dslearnbds.entities.Notification;

public class NotificationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private Instant moment;
	private boolean read;
	private String route;

	private UserDTO userDTO;

	public NotificationDTO() {
	}

	public NotificationDTO(Long id, String text, Instant moment, boolean read, String route, UserDTO userDTO) {
		super();
		this.id = id;
		this.text = text;
		this.moment = moment;
		this.read = read;
		this.route = route;
		this.userDTO = userDTO;
	}

	public NotificationDTO(Notification entity) {
		this.id = entity.getId();
		this.text = entity.getText();
		this.moment = entity.getMoment();
		this.read = entity.getRead();
		this.route = entity.getRoute();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

}
