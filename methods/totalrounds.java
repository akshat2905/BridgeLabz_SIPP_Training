package methods;

import java.util.*;



public class totalrounds {

    public static double calculateRound(double side1,double side2, double side3, double totaldistance){
    double perimeter = side1 + side2 + side3;
    return totaldistance/perimeter;
}

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double totaldistance = 5000;

        double rounds = calculateRound(side1 , side2 , side3 , totaldistance);

        System.out.println(rounds);

       
    }
}
