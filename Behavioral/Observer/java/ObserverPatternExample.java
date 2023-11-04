package Behavioral.Observer.java;

public class ObserverPatternExample {
    public static void main(String[] args) {
        AccountService account1 = createAccount("hoangtien2k3qx1@gmail.com", "12.04.2003");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("------------------------------------");
        AccountService account2 = createAccount("tienhoang2k3@gmail.com", "116.108.77.231");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }

}
