/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes enum input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * Using enums avoids String input and produces reliable results.
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE, TWO, THREE):");
        try {
            StatusCode code = StatusCode.valueOf(in.next().toUpperCase());
            StausUser statusUser = new StausUser();
            statusUser.statusDetail(code);
        } catch (IllegalArgumentException e) {
            System.out.println("NOT VALID CODE");
        }
    }
}
