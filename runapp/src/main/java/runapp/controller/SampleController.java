package runapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import runapp.dao.AccountRepository;
import runapp.model.Account;
import runapp.service.AccountService;

@RestController
public class SampleController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
//	@GetMapping("/all-accs")
//	public String allAccounts() {
//		return accountService.findAll().toString();
//	}
//	
//	
//	@GetMapping("/save-acc")
//	public String saveTask(@RequestParam String forename, @RequestParam String surname, @RequestParam int account_number) {
//		
//		Account newAcc = new Account(forename, surname, account_number);
//		
//		accountService.save(newAcc);
//		
//		return "Account Added!";
//	}
//	
//	@GetMapping("/delete-acc")
//	public String saveTask(@RequestParam int account_number) {
//		
//		accountService.delete(account_number);
//		
//		return "Account Deleted.";
//	}
	
}
