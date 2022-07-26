package com.card_api.card_api.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name = "Card")
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String Card;
	
	@Column
	private String MonthOfExpiry;
	
	@Column
	private String YearOfExpiry;
	
	@Column
	private String CVC;
	
	@Column
	private String CardType;
	
	@Column
	private Date date;
	
	
	public Card() {
	}
	
	


	public Card(long id, String card, String monthOfExpiry, String yearOfExpiry, String cVC, String cardType,
			Date date) {
		super();
		this.id = id;
		Card = card;
		MonthOfExpiry = monthOfExpiry;
		YearOfExpiry = yearOfExpiry;
		CVC = cVC;
		CardType = cardType;
		this.date = date;
	}




	public String getMonthOfExpiry() {
		return MonthOfExpiry;
	}




	public void setMonthOfExpiry(String monthOfExpiry) {
		MonthOfExpiry = monthOfExpiry;
	}




	public String getYearOfExpiry() {
		return YearOfExpiry;
	}




	public void setYearOfExpiry(String yearOfExpiry) {
		YearOfExpiry = yearOfExpiry;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCard() {
		return Card;
	}


	public void setCard(String card) {
		Card = card;
	}


	

	public String getCVC() {
		return CVC;
	}


	public void setCVC(String cVC) {
		CVC = cVC;
	}


	public String getCardType() {
		return CardType;
	}


	public void setCardType(String cardType) {
		CardType = cardType;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}




	@Override
	public String toString() {
		return "Card [id=" + id + ", Card=" + Card + ", MonthOfExpiry=" + MonthOfExpiry + ", YearOfExpiry="
				+ YearOfExpiry + ", CVC=" + CVC + ", CardType=" + CardType + ", date=" + date + "]";
	}




	
	
}
