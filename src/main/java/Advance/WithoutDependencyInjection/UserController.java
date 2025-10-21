package Advance.WithoutDependencyInjection;

class UserController {
    private EmailService emailService = new EmailService(); // ❌ creates its own dependency

    void processUser() {
        emailService.sendEmail("Welcome User!");
    }
}
