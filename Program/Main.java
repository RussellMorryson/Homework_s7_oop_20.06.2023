package Program;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getAnonymousLogger();
        System.out.println("Программа для выполнения орифметических операций с комплексными числами");
        System.out.println("Расчеты осуществляются между действительными числами и действительными числами с мнимымой частью");
        boolean work = true;        
        while(work) {
            logger.info("Программа запущена");            
            System.out.println("Запуск!");
            System.out.println("Инициализация первого числа...");
                Initialization num1 = new Initialization();                
                logger.info("Введено первое число (вещественная и мнимая часть)");
            System.out.println("Инициализация второго числа...");
                Initialization num2 = new Initialization();                
                logger.info("Введено второе число (вещественная и мнимая часть)");
            Calculator numbers = new Calculator(num1, num2);
                logger.info("Числа, как объекты класса Initialization разделены на вещественное и мнимое числа для дальнейших расчетов");
            Menu menu = new Menu(numbers);
                logger.info("Числа, как объекты класса Calculator переданы в меню для расчетов");
                logger.info("Результат расчетов выведен на экран");
            System.out.println("Хотите сделать расчеты с другими числами? 1 / 0: ");              
            boolean repeat = true;
            int agree = 1;
            while(repeat) {
                logger.info("Запрос ввода пользователя для продолжение работы программы");
                agree = scanner.nextInt();
                if (agree == 1) {            
                    repeat = false;
                    logger.info("Введено: 1. Программа продолжает работать");                                  
                } else if (agree == 0) {
                    System.out.println("Программа закрыта!");
                    work = false;
                    repeat = false;
                    logger.info("Введено: 0. Программа закрывается");                         
                } else {
                    System.out.println("Некорректный ввод! Повторите попытку!");
                    logger.info("Пользователь ввел некорректное значение");                         
                }
            }            
        }
        scanner.close(); 
    }
}
