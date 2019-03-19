package com.example.BankLotteryApp.Business;

import java.util.HashMap;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class AccNumGenImpl10 implements AccNumGenService {
	@Override
	public String generateNumber() {

		Random rand = new Random();
		HashMap<String, String> accountNumbers = new HashMap<>();
		String username = "meh";
		int letterChoice = rand.nextInt(3);
		Character letter = new Character('a');
		int accountNumber = 0;
		String response = "";
		char[] letters = ("abc").toCharArray();

		accountNumber = 100000000 + rand.nextInt(900000000);
		response = Integer.toString(accountNumber) + Integer.toString(rand.nextInt(10));

		if (accountNumbers.containsValue(letter + response)) {
			return "that account number is in use";
		} else {

			accountNumbers.put(username, letters[letterChoice] + response);
			return letters[letterChoice] + response;
		}

	}

}
