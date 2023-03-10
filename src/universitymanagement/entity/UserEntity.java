package universitymanagement.entity;

/**
 * User entity.
 *
 * @author hasu
 */
public class UserEntity extends UniversityAbstractEntity {

    private String password;
    private int role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public UserEntity() {
        this.password = "";
        this.role = -1;
    }

}
