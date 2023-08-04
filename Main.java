import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		//Start program
		
		main.MainScreen() ;

	}
	
	private void MainScreen() {
		
		while(true) {
		int choice =Integer.parseInt( JOptionPane.showInputDialog("Welcome to MyBank!\n[1]Login | [2]Create Account | [3]Exit"));
		
			if(choice == 1) {
				String username =JOptionPane.showInputDialog("Enter Username");
				String password = JOptionPane.showInputDialog("Enter Password");
				
				if(!username.isEmpty() && !password.isEmpty()) {
					DataHandle data = new DataHandle();
					
					//Condition
					if(data.checker(username, password)) {
						AccountCreation x = data.getData(username, password);
						while(true) {
						int option =Integer.parseInt( JOptionPane.showInputDialog("DashBoard!\nName: "+ x.getFirstName() +" "+x.getLastName()+"\n[1]View Balance\n[2]Deposit\n[3]Withdraw\n[4]History\n[5]Exit"));
						
						//View Balance
						if(option == 1) {
							JOptionPane.showMessageDialog(null,"Balance: "+  x.getBalance());
						}
						//Deposit
						else if(option == 2) {
							double deposit  = Double.parseDouble(JOptionPane.showInputDialog("Enter Deposit Amount (10 - 9000): "));
							
							if(deposit >=10 && deposit <= 9000) {
								x.deposit(deposit);
								JOptionPane.showMessageDialog(null,"Successful!");
							}
							else
								JOptionPane.showMessageDialog(null,"Invalid Amount");
						}
						//Withdraw
						else if (option == 3) {
							double withdraw  = Double.parseDouble(JOptionPane.showInputDialog("Enter Withdrawal Amount: "));
							
							if(withdraw >= 0 && withdraw <= x.getBalance()) {
								x.withdraw(withdraw);
								JOptionPane.showMessageDialog(null,"You've Withdraw: P "+ withdraw);
							}
							else
								JOptionPane.showMessageDialog(null,"Withdraw amount exceed of current balance!");
						}
						//History
						else if(option == 4) {
							x.history();
						}
						//Exit
						else if(option == 5)
							break;
						else 
							JOptionPane.showMessageDialog(null, "Invalid Input!");
						
						}
					}
					else
						JOptionPane.showMessageDialog(null, "Invalid Username and Password");
					
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid Username and Password");
			}
			else if(choice == 2) {
				String firstname = JOptionPane.showInputDialog("Enter Firstname");
				String lastname = JOptionPane.showInputDialog("Enter Lastname");
				String username = JOptionPane.showInputDialog("Enter Username");
				String password = JOptionPane.showInputDialog("Enter Password");
				
				if(!firstname.isEmpty()&&!lastname.isEmpty()&&!username.isEmpty()&&!password.isEmpty()) {
					//Object Created
					AccountCreation data = new AccountCreation(firstname, lastname,username);
					//Storing in Hash map
					new DataHandle(username, password,data);
					JOptionPane.showMessageDialog(null, "Successful!");
				}
				
				
			}
			else if(choice == 3)
				break;
			else {
				JOptionPane.showMessageDialog(null, "Invalid Input!");
				
				
			}
		}
	}

}
