package bank;

public class Account {

	String accountNo;
	String ownerName;
	int balance;

	public Account(String no, String name, int money) {
		accountNo = no;
		ownerName = name;
		balance = money;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) {
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;

	}

}
