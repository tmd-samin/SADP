public class User {
    public void login(String username, String password) {
        AuthenticationService authenticationService = new AuthenticationService();
        authenticationService.login(username, password);
    }
}
