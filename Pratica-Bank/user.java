import java.util.Date;

public class User {
    private String name;
    private String identity;
    private Date dateBirth;
    private Date dateCreated;
    private int cep;
    private String email; // Substituído por String
    private String password;
    private String userType;

    
    // Construtor com parâmetros
    public User(String name, String identity, Date dateBirth, int cep, String email, String password, String userType) {
        this.name = name;
        this.identity = identity;
        this.dateBirth = dateBirth;
        this.dateCreated = new Date(); // Inicializa com a data atual
        this.cep = cep;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
