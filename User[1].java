
package librarymanagementsystem;

/**
 *
 * @author Rafi
 */
public abstract class User {
    protected String username,password,usertype;
    protected String phnNo;
    
protected String uniqueID;
protected String mothersName;
protected String fathersName;
protected String bloodGroup;
protected String religion;
protected String emailID;
protected String nationality;
//protected double payment;
    public User(){
        
    }
    public User(String username, 
                String password,String usertype, 
                String phnNo, 
                String uniqueID, 
                String mothersName, 
                String fathersName, 
                String bloodGroup, 
                String religion, 
                String emailID, 
                String nationality) throws IllegalPasswordException {
        if (!IllegalPasswordException.isValidPassword(password)) {
            throw new IllegalPasswordException("Invalid password: Must atleast use one uppercase , one lowercase , one digits");
        }else{
        this.username = username;
        this.password = password;
        this.phnNo = phnNo;
        this.uniqueID = uniqueID;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.bloodGroup = bloodGroup;
        this.religion = religion;
        this.emailID = emailID;
        this.nationality = nationality;
        //this.payment = payment;
            
        }

    }
      public String getUsername() {
        return username;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getReligion() {
        return religion;
    }

    public String getPhnNo() {
        return phnNo;
    }


    public String getPassword() {
        return password;
    }

    public String getNationality() {
        return nationality;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void display(){
        System.out.println("Username: "+ username);
    }
    
}
