/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author naol
 */
public class Admin extends User {
    
    public static Admin fromUser(User u) {
        Admin admin = new Admin();
        admin.FirstName = u.FirstName;
        admin.LastName = u.LastName;
        admin.BankAccountNo = u.BankAccountNo;
        admin.PhoneNumber = u.PhoneNumber;
        admin.Role = u.Role;
        admin.SSN = u.SSN;
        return admin;
    }
    
}
