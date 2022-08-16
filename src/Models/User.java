package Models
       ;

import Controllers.DBController;
import Exceptions.InvalidFormException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    public int SSN;
    public String FirstName;
    public String LastName;
    public String PhoneNumber;
    public Roles Role;
    public String BankAccountNo;
    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Roles getRole() {
        return Role;
    }

    public void setRole(Roles role) {
        Role = role;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        BankAccountNo = bankAccountNo;
    }



    public  User() {}

    public User(int SSN, String firstName, String lastName, String phoneNumber, Roles role, String bankAccountNo) {
        this.SSN = SSN;
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
        Role = role;
        BankAccountNo = bankAccountNo;
    }


    public static User login(int ssn, String password) throws InvalidFormException {
        try {
            String hashed_pass = DBController.hash_md5(password);

            PreparedStatement sql = DBController.getPreparedStmt("SELECT * FROM User WHERE SSN=? AND Password=?");
            sql.setInt(1, ssn);
            sql.setString(2, hashed_pass);

            ResultSet result  = sql.executeQuery();

            if (result.next()) {
                User current = new User();
                current.SSN = result.getInt("SSN");
                current.FirstName = result.getString("FirstName");
                current.LastName = result.getString("LastName");
                current.PhoneNumber = result.getString("PhoneNumber");
                current.BankAccountNo = result.getString("BankAccountNo");
                current.Role = Roles.valueOf(result.getString("Role"));
                return  current;
            }else {
                throw new InvalidFormException("Incorrect SSN or Password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new User();
    }
}
