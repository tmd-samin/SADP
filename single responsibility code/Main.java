public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("TEST", "TEST", "TEST");

        User user = new User();
        user.login("username", "password");
    }
}

