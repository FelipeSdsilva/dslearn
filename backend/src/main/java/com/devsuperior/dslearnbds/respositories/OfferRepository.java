package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
