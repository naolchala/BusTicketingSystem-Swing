/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author naol
 */
public class Agent extends User {
    Agent() {

    }
    public Agent(User u) {
        this.FirstName = u.FirstName;
        this.LastName = u.LastName;
        this.BankAccountNo = u.BankAccountNo;
        this.PhoneNumber = u.PhoneNumber;
        this.Role = u.Role;
        this.SSN = u.SSN;
    }
}
