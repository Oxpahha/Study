public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator){
        int result;

        switch (operator){
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if(secondOperand!=0){
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalStateException("Unexpected operator");

        }
        return result;
    }
}
