interface Atm {
	void depositMoney(String amount);
	void withdrawMoney(String amount);
	default void connectionWithTheBank() {
		System.out.println("You are connected with bank");
	}
	static String endMyWork() {
		return "Termination of the activity ATM";
	}
}

class ATMImplementation implements Atm {
	public void depositMoney(String amount) {
		System.out.println("paid into the account " + amount);
	}
	public void withdrawMoney(String amount) {
		System.out.println("paid out of the account " + amount);
	}
}

class Application {
	public static void main (String[] args) throws java.lang.Exception {
		ATMImplementation ja = new ATMImplementation();
		ja.connectionWithTheBank();
		ja.depositMoney("300 zl");
		ja.withdrawMoney("100 zl");
		System.out.println(Atm.endMyWork());
		
	}
}