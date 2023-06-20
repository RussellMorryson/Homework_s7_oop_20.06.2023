package Program;

public class Calculator {
    private double xr;
    private double xi;
    private double yr;
    private double yi;
    private double resR;
    private double resI;
    
    Calculator (Initialization x, Initialization y) {
        System.out.println("Инициализация чисел по типу...");
        this.xr = x.getR();
        this.xi = x.getI();
        this.yr = y.getR();
        this.yi = y.getI(); 
    }

    public void addition() {
        resR = xr + yr;
        resI = xi + yi;
        System.out.println("Результат: " + resR + " + " + resI + "i");
    }
    public void substraction() {
        resR = xr - yr;
        resI = xi - yi;
        System.out.println("Результат: " + resR + " + " + resI + "i");
    }
    public void multiplication() {
        resR = xr * yr;
        resI = xi * yi;
        System.out.println("Результат: " + resR + " + " + resI + "i");
    }
    public void division() {
        resR = xr / yr;
        resI = xi / yi;
        System.out.println("Результат: " + resR + " + " + resI + "i");
    }
}
