import com.cg.bank.AccountFactory;
import com.cg.bank.Bank;
import com.cg.bank.BankException;
import com.cg.bank.CurrentAccount;


public class AccountTestPoly {
	public static void main(String[] args) {

		Bank s1 = AccountFactory.openAccount("savings", "John");
		

		try {
			System.out.println("B4");
			s1.withdraw(2000);
			System.exit(0);
			System.out.println("After");
		} catch (BankException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); // Developers - trouble shoot
//			System.out.println(e); // Logging - audit behaviour
			System.out.println(e.getMessage());// End users
		} finally{
			System.out.println("Finally block");
		}

		
	}
}
