package Advance.WithoutDependencyInjection;

// No abstraction — tightly coupled
class EmailService {
    void sendEmail(String msg) {
        System.out.println("Email sent: " + msg);
    }
}
