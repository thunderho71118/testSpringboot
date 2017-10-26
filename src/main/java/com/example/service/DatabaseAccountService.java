package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.RiskAssessor;

@Service
public class DatabaseAccountService implements AccountService
{
	private final RiskAssessor riskAssessor;

	@Autowired
	public DatabaseAccountService(RiskAssessor riskAssessor)
	{
		this.riskAssessor = riskAssessor;
	}

	// ...

}
