import java.util.ArrayList;

public class ViewIncome {
	
	private ArrayList accountTransaction = new ArrayList(); 
	
	private String account = new String();
	

	


public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public ArrayList getAccountTransaction() {
	return accountTransaction;
}

public void setAccountTransaction(ArrayList accountTransaction) {
	this.accountTransaction = accountTransaction;
}


public ViewIncome(String account, ArrayList accountTransaction) {
	super();
	this.account = account;
	this.accountTransaction = accountTransaction;
	
}

}
