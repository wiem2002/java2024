import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Enter the number of cages: ");
        zoo.nbrCages = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the zoo name: ");
        zoo.zooName = sc.nextLine();

        System.out.println("Number of cages: " + zoo.nbrCages);
        System.out.println("Zoo Name: " + zoo.zooName);

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}