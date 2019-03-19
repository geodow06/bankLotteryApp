package com.example.BankLotteryApp.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankLotteryApp.Business.AccNumGenService;
import com.example.BankLotteryApp.Repository.RepositoryInterface;

@RestController
public class AccNumGenController {

	private AccNumGenService svc;
	private RepositoryInterface repo;

	public AccNumGenService getAccNumGenService() {
		return svc;
	}

	public RepositoryInterface getRepositoryInterface() {
		return repo;
	}

	public AccNumGenController(AccNumGenService svc) {
		this.svc = svc;

	}

	@RequestMapping("/getAccNum")
	public String getAccNum() {
		return svc.generateNumber();
	}

	@RequestMapping("/addAccNum/{accountNumber}")
	public String addAccNum(@PathVariable String accountNumber) {
		return repo.storeAccounts(accountNumber);
	}

	@Override
	public String toString() {
		return "AccNumGenController [svc=" + svc + "repo=" + repo + "]";
	}
}