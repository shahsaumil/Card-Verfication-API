package com.card_api.card_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card_api.card_api.dao.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String>{

}
