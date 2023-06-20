package Program;

import java.util.Scanner;

public class Initialization {   

    private double r;
    private double i;

    Initialization() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Число состоит из двух частей:");
        System.out.println("\t 1 - Вещественная часть");
        System.out.println("\t 2 - Мнимая часть");       

        System.out.println("Введите вещественную часть числа: ");            
            r = scan.nextDouble();
            
        System.out.println("Введите мнимую часть числа: ");
            i = scan.nextDouble();             
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setI(double i) {
        this.i = i;
    }
    public double getI() {
        return i;
    }    
}
