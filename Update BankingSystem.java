import java.util.Scanner;

class Account {
    String name;
    double balance;

    Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Account acc = new Account(name);
        int option;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show Balance\n4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while(option != 4);
    }
}

