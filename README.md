1️⃣ Program 1:
Write a program to print your name.

public class my_name {
    public static void main(String[] args) {
        System.out.println("HARSH GAJANAN KUBADE");
    }
}


2️⃣ Program 2:
Write a program to take *your name and age as input from the user* and print them.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



