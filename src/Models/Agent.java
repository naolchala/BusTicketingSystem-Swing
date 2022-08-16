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
    public static Agent fromUser(User u) {
        Agent agent = new Agent();
        agent.FirstName = u.FirstName;
        agent.LastName = u.LastName;
        agent.BankAccountNo = u.BankAccountNo;
        agent.PhoneNumber = u.PhoneNumber;
        agent.Role = u.Role;
        agent.SSN = u.SSN;
        return agent;
    }
}
