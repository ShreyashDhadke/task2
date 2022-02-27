import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First Number: ");
        int firstNum = in.nextInt();
        System.out.print("Second Number: ");
        int secondNum = in.nextInt();
        System.out.print("Which operator (+,-,*,/): ");
        String operator = in.next();

        in.close();

        switch(operator){
            case "+":
                System.out.println(firstNum+secondNum);
                break;
            case "-":
                System.out.println(firstNum-secondNum);
                break;
            case "*":
                System.out.println(firstNum*secondNum);
                break;
            case "/":
                System.out.println(firstNum/secondNum);
                break;

        }

    }
}