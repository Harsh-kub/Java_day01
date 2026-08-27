import java.util.Scanner;

public class traffic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fine = 0;
        int speedLimit = 60;
        
        
        System.out.print("IS THIS VEHICLE AN EMERGENCY VEHICLE (Y/N): ");
            char emergency = sc.next().charAt(0);
            
            if (emergency == 'Y' || emergency == 'y') {
                System.out.println("NO FINE");
                System.exit(0);
            }
            
          
            System.out.print("ENTER VEHICLE NUMBER: ");
            String v = sc.next();
            
            
            System.out.print("ENTER VEHICLE SPEED: ");
            int speed = sc.nextInt();
            
 
            System.out.print("ENTER DRIVER AGE: ");
            int age = sc.nextInt();
            

            System.out.print("HAS THE USER VALID DRIVING LICENCE (Y/N): ");
            char license = sc.next().charAt(0);
  
            System.out.print("IS THE USER RIDING A TWO WHEELER (Y/N): ");
            char twowheeler = sc.next().charAt(0);
            
            
            if (twowheeler == 'Y' || twowheeler == 'y') {
                
               
                if (speed > speedLimit) {
                    fine = fine + 1000;
                }
                
              
                System.out.print("IS THE USER WEARING HELMET (Y/N): ");
                char helmet = sc.next().charAt(0);
                
                if (helmet == 'N' || helmet == 'n') {
                    fine = fine + 500;
                }
                
            } else {
                
               
                if (speed > speedLimit) {
                    fine = fine + 1000;
                }
                
              
                System.out.print("IS THE USER WEARING SEATBELT (Y/N): ");
                char seatbelt = sc.next().charAt(0);
                
                if (seatbelt == 'N' || seatbelt == 'n') {
                    fine = fine + 500;
                }
            }
            
        
            if (age < 18) {
                fine = fine + 1000;
            }
            
           
            if (license == 'N' || license == 'n') {
                fine = fine + 2000;
            }
            
            
            System.out.println("\n----- TRAFFIC VIOLATION REPORT -----");
            System.out.println("Vehicle Number: " + v);
            System.out.println("Total Fine: Rs. " + fine);
            
            if (fine == 0) {
                System.out.println("NO TRAFFIC VIOLATION");
            } else {
                System.out.println("TRAFFIC VIOLATION DETECTED");
            }
        }
    }
