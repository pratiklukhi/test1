public class Calculator{
    int a=45;
    int b=15;
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
    }
    public static void addition() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.a + calculator.b);
    }
    public static void subtraction(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.a - calculator.b);
    }
    public static void multiplication(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.a * calculator.b);
    }
    public static void division(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.a / calculator.b);}
}

