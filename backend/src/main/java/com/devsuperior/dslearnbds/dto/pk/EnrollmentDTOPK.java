package com.devsuperior.dslearnbds.dto.pk;

import java.io.Serializable;

import com.devsuperior.dslearnbds.dto.OfferDTO;
import com.devsuperior.dslearnbds.dto.UserDTO;

public class EnrollmentDTOPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private UserDTO userDTO;
	private OfferDTO offerDTO;

	public EnrollmentDTOPK() {
	}

	public EnrollmentDTOPK(UserDTO userDTO, OfferDTO offerDTO) {
		super();
		this.userDTO = userDTO;
		this.offerDTO = offerDTO;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public OfferDTO getOfferDTO() {
		return offerDTO;
	}

	public void setOfferDTO(OfferDTO offerDTO) {
		this.offerDTO = offerDTO;
	}

}
