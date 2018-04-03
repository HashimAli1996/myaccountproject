package runapp.dao;

import org.springframework.data.repository.CrudRepository;

import runapp.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}