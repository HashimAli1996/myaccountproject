package runapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import runapp.model.Account;
import runapp.service.AccountService;

@Controller
public class MainController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/all-accounts")
	public String allAccounts(HttpServletRequest request) {
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "index";
	}
	
	@GetMapping("/new-account")
	public String newAccount(HttpServletRequest request) {
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-account")
	public String saveAccount(@ModelAttribute Account account, HttpServletRequest request) {
		accountService.save(account);
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "index";
	}
	
	@GetMapping("/update-account")
	public String updateAccount(@RequestParam int acc_id, HttpServletRequest request) {
		request.setAttribute("accounts", accountService.findAccount(acc_id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-account")
	public String deleteAccount(@RequestParam int acc_id, HttpServletRequest request) {
		accountService.delete(acc_id);
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "index";
	}
	
	

}
