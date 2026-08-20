1️⃣ Program 1:
Write a program to print your name.

    public class my_name {
    public static void main(String[] args) {
        System.out.println("HARSH GAJANAN KUBADE");
    }
}


2️⃣ Program 2:
Write a program to take *your name and age as input from the user* and print them..

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

3️⃣ Program 3:
Write a program to take *5 names as input from the user* and print all 5 names.


        import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nThe 5 names are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}

Day 02 Challenge.

    public class day_2 {
    // Data attributes
    String name;
    int age;
    int rollNo;
    public day_2(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNo);
    }

    public static void main(String[] args) {
        day_2 student1 = new day_2("Harsh", 19, 20);
        student1.display();
    }
}

Even or odd

    import java.util.Scanner;

    public class sec6 {
       public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int var2 = sc.nextInt();
      if (var2 % 2 == 0) {
         System.err.println("even");
      } else {
         System.out.println("odd");
      }

       }
    }

greatest of 3


    import java.util.*;

    public class sec7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("enter num3: ");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
        System.out.println("num1 is the highest");
        }
        else if (num2>num1 && num2>num3){
        System.out.println("num2 is the highest");
        }
        else{
            System.out.println("num3 is the greatest");
        }
    }
    }

TABLES 

    import java.util.*;


    public class sec8 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
    
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        for (int i =1;i<11;i++){
            int table = num*i;
            System.err.println(num+"X"+i+"="+table);
        };
        

    }
    }

Positive , negative or zero

    import java.util.Scanner;

    public class positive
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if(number < 0) {
                System.out.println("The number is Negative.");
            }
            else{
                System.out.println("The number is zero");
            }
        }
    }

Palindrome of a number

    import java.util.Scanner;

    class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    }

    
    


