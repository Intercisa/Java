package com.in28minutes.microservices.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.in28minutes.microservices.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepositoryImplementation<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);
	
}
