public class HW {
    public static void main(String[] args) {
        taskThree();
    }
    static void taskTwo(){
    /*
        Необходимо вывести все положительные степени числа 5 
        которые меньше 10000, вывести результат возведения в степень.
    */
        int num = 5;
        int border = 10000;
        System.out.println("Положителье степени числа "+num);
        int count = 1;
        for (int i = 5; i <= border; i=i*num) {
            if (count%2==0) {
                System.out.print(i+" ");
            }
            count++;
        }
    }
    static void taskThree(){
    /*
    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
    Реализовать 2 варианта: 
    1. использовать конструкцию if для определения кратности 
    цикл с шагом 1, i = i + 1);
    2. без использования конструкции if (шаг цикла на ваше усмотрение).
        */
        int lowBorder = 40;
        int highBorder = 60;
        int even = 4;

        for (int i = lowBorder; i <= highBorder; i++) {
            if(i%even==0){
                System.out.print(i+" ");
            }
        }    
        System.out.println();
        for (int j = lowBorder; j <= highBorder; j= j+even) {
            System.out.print(j+" ");
        }    
    }
        
}
