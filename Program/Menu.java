package Program;

import java.util.Scanner;

public class Menu {    
    public int choice;

    Menu(Calculator numbers) {        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Выберите операцию: ");
        System.out.println("\t1 - Сложение");
        System.out.println("\t2 - Вычитание");
        System.out.println("\t3 - Умножение");
        System.out.println("\t4 - Деление");
        
        choice = scanner.nextInt();
        switch(choice) {
            case 1:
               System.out.println("Выбрана операция сложения");
                numbers.addition();
                break;
            case 2:
                System.out.println("Выбрана операция вычитания");
                numbers.substraction();
                break;
            case 3:
                System.out.println("Выбрана операция умножения");
                numbers.multiplication();
                break;
            case 4: 
                System.out.println("Выбрана операция деления");
                numbers.division();
                break;
            default:
                System.out.println("Введено неверное число, повторите попытку!");
        }        
    }
};
