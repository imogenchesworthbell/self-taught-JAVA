public class Calculator {

    public static void main(String[]args){
        System.out.println("Welcome to my Calculator");

        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            break;
        }
        System.out.println("Result: " + result);
    /*   //using if else instead of switch
     if(opCode == 'a')
            result = value1 + value2;
        else if(opCode == 's')
            result = value1 - value2;
        else if(opCode == 'm')
            result = value1 * value2;
        else if(opCode == 'd'){
            if(value2 != 0)
                result = value1 / value2;

        }
        else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }

        System.out.println("Result: " + result);*/
    }
}
