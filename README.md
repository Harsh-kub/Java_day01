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
