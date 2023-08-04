import javax.swing.JOptionPane;
public class AccountCreation {
	
	private  String firstname = "";
	private  String lastname = "";
	private String username = "";
	private double balance = 0;
	private String output = "";
	
	AccountCreation(){
		//Default Constructor
	}
	AccountCreation(String firstname, String lastname, String username){
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.balance = 100;
	}
	
	//Method getter
	
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}
	public String getUsername() {
		return this.username;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		output+="Deposited: "+amount+"\n";
		this.balance+= amount;
	}
	public void withdraw(double amount) {
		output+="Withdrawed: "+amount+"\n";
		this.balance -= amount;
	}
	public void history() {
		JOptionPane.showMessageDialog(null, "History\n"+output);
	}
	
	

}
