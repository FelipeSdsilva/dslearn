package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

public class Enrollment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private EnrollmentPK id = new EnrollmentPK();
	private Instant enrollMoment;
	private Instant refoundMoment;
	private boolean avaliable;
	private boolean onlyUpdate;
	
	public Enrollment() {
	}

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refoundMoment, boolean avaliable,
			boolean onlyUpdate) {
		super();
		id.setUser(user); 
		id.setOffer(offer);;
		this.enrollMoment = enrollMoment;
		this.refoundMoment = refoundMoment;
		this.avaliable = avaliable;
		this.onlyUpdate = onlyUpdate;
	}
	
	
}
