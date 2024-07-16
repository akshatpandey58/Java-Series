import java.util.Scanner;

class Car{
String Model;
double fuelperlitre, fuelcost;
int mileage, kms;

Car() {
    kms = 0; // Changed from null to 0
    fuelperlitre = 0;
    mileage = 0;
}

void computeFuelcost() {
    fuelcost = kms * fuelperlitre;
    System.out.println("Total cost required for fuel: " + fuelcost);
}

public static void main(String args[]) {
    Car ob = new Car(); // Added an object to use all the methods and variables
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the kms: ");
    ob.kms = sc.nextInt();
    System.out.print("Enter the fuel cost per litre: ");
    ob.fuelperlitre = sc.nextDouble();
    // System.out.print("Enter the total kms to travel: "); Statement maybe not
    // required
    sc.close();
    ob.computeFuelcost();
}
}
