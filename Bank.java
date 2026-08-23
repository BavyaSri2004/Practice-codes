package package1;

import java.util.Objects;

public class Bank {
  @Override
	public int hashCode() {
		return Objects.hash(accountname, accountnumber, balance, credit, debit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Bank other = (Bank) obj;
		return Objects.equals(accountname, other.accountname) && accountnumber == other.accountnumber
				&& balance == other.balance && credit == other.credit && debit == other.debit;
	}
  @Override
	public String toString() {
		return "Bank [accountname=" + accountname + ", accountnumber=" + accountnumber + ", credit=" + credit
				+ ", debit=" + debit + ", balance=" + balance + "]";
	}
  private String accountname;
  private int accountnumber;
  private int credit;
  private int debit;
  private int balance;
  
  public Bank(String accountname, int accountnumber, int credit, int debit, int balance) {
	super();
	this.accountname = accountname;
	this.accountnumber = accountnumber;
	this.credit = credit;
	this.debit = debit;
	this.balance = balance;
}
  public String getAccountname() {
	return accountname;
  }
  public void setAccountname(String accountname) {
	this.accountname = accountname;
  }
  public int getAccountnumber() {
	return accountnumber;
  }
  public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
  }
  public int getCredit() {
	return credit;
  }
  public void setCredit(int credit) {
	this.credit = credit;
  }
  public int getDebit() {
	return debit;
  }
  public void setDebit(int debit) {
	this.debit = debit;
  }
  public int getBalance() {
	return balance;
  }
  public void setBalance(int balance) {
	this.balance = balance;
  }
}
