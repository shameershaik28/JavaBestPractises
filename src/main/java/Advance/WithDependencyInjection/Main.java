package Advance.WithDependencyInjection;

public class Main {
    public static void main(String[] args) {
        MessageService msg = new SMSService();  // inject SMS or Email easily
        UserController u = new UserController(msg);
        u.processUser();
    }
}
