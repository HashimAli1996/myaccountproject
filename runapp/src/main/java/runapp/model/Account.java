package runapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="accounts")
public class Account implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int acc_id;
	private String forename;
	private String surname;
	private int account_number;
	
	public Account() {}

	public Account(String forename, String surname, int account_number) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.account_number = account_number;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	@Override
	public String toString() {
		return "Account [forename=" + forename + ", surname=" + surname + ", account_number=" + account_number + "]";
	}
	
}
