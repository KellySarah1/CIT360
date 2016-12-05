import java.util.ArrayList;

public class InputIncome {

	private String account = new String(); 
	
	private ArrayList income = new ArrayList();
	
	private String description = new String();
	
	private double balance;
	
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public ArrayList getIncome() {
		return income;
	}

	public void setIncome(ArrayList income) {
		this.income = income;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public InputIncome(String account, ArrayList income, String description, double balance) {
		super();
		this.account = account;
		this.income = income;
		this.description = description;
		this.balance = balance;
	}

	public double addIncome(String account, Double income1) {
		
	
		double acounintomce = 0;
		return acounintomce;
		
	}
	
	public double balance(String account, Double income2, Double balance) {
		
		
		double accountbalanceincome2 = 0;
		
		return accountbalanceincome2;
		
	}

}

