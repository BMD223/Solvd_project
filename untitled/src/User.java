public abstract class User {

    private String name, surname;
    protected String email;

    public User(){
    }
    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getEmail() {
        return email;
    }

    public abstract String getIdentification();

    @Override
    public String toString() {
        return getName()+" "+getSurname();
    }
    @Override
    public int hashCode() {
        //just email will suffice for now
        return email.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        //we have to cast this to access email and we know that it isn't going to crash, becuase we already checked if the classes are the same
        return email != null ? email.equals(user.email) : user.email == null;
    }
}
