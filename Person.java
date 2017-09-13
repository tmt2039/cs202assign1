


public class Person {

 public String firstN, lastN, email, userN, password, gender;

 public int sSN, dOB, phone;

    public Person(String firstN, String lastN, String email, String userN, String password, String gender, int sSN, int dOB, int phone) {
        this.firstN = firstN;
        this.lastN = lastN;
        this.email = email;
        this.userN = userN;
        this.password = password;
        this.gender = gender;
        this.sSN = sSN;
        this.dOB = dOB;
        this.phone = phone;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserN() {
        return userN;
    }

    public void setUserN(String userN) {
        this.userN = userN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getsSN() {
        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
    }

    public int getdOB() {
        return dOB;
    }

    public void setdOB(int dOB) {
        this.dOB = dOB;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                ", email='" + email + '\'' +
                ", userN='" + userN + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", sSN=" + sSN +
                ", dOB=" + dOB +
                ", phone=" + phone +
                '}';
    }
}
