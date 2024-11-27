package src;
public class Logar {
    private User user;
    public Logar(User user) {
        this.user = user;
    }

    public boolean logar(String email, String password) {
        return user.getEmail().equals(email) && user.getPassword().equals(password);
    }
}
