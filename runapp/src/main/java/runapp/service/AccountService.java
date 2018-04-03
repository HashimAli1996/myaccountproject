package runapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import runapp.dao.AccountRepository;
import runapp.model.Account;

@Service
@Transactional
public class AccountService {

	private final AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<>();
		for (Account account : accountRepository.findAll()) {
			accounts.add(account);
		}
		return accounts;
	}
	
	public void save(Account account) {
		accountRepository.save(account);
	}
	
	public Optional<Account> findAccount(int acc_id) {
		return accountRepository.findById(acc_id);
	}
	
	/*
	public void overwrite(Optional<Account> optional) {
		//take account with specific ID
		
		//take new changes and assign them to same id		
	}*/
	
	/*
	public Optional<Account> findAccount(int account_number) {
		for(int i = 0; i < findAll().size(); i++) {
			int acc = findAll().get(i).getAccount_number();
			if(acc == account_number) {
				int id = findAll().get(i).getAcc_id();
				return accountRepository.findById(id);
			}
		}
		return null;
	}*/
	
	public void delete(int acc_id) {
		accountRepository.deleteById(acc_id);
	}
	/*
	public void delete(int account_number) {
		
		for(int i = 0; i < findAll().size(); i++) {
			int acc = findAll().get(i).getAccount_number();
			
			//question and probE
			if(acc == account_number) {
				accountRepository.delete(findAll().remove(i));
			}
		}		
	}*/

}
