
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account mattewAcc = new Account("Matthews account", 1000);
        
        Account HabeebAccount = new Account("My account", 0);
        
        mattewAcc.withdrawal(100);
        
        HabeebAccount.deposit(100);
        
        System.out.println(mattewAcc);
        
        System.out.println(HabeebAccount);
    }
}
