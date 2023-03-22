public class HW8 {
    public static void main(String[] args) {
        HW();
    }

    static void HW(){
        Manager jerd = new Manager();

        jerd.setName("Jerd","Broock");
        jerd.setGender(1);
        jerd.setBaseSalary(100);
        jerd.setNumberOfSubordinates(12);


        Manager john = new Manager();

        john.setName("John","Doe");
        john.setGender(1);
        john.setBaseSalary(100);
        john.setNumberOfSubordinates(15);

        System.out.println(john.getFullName());
        System.out.println(john.getBaseSalary());
        System.out.println(john.getSalaryManager());
        System.out.println(john.getSalary(10));
        //
        System.out.println();
        //
        Worker jade = new Worker();

        jade.setName("Jade","Blue");
        jade.setGender(2);
        jade.setBaseSalary(50);

        System.out.println(jade.getFullName());
        System.out.println(jade.getSalaryWorker());
        System.out.println(jade.getSalary(10));
        //
        System.out.println();
        //
        Director luke = new Director();

        luke.setName("Luke","Greedy");
        luke.setGender(0);
        luke.setBaseSalary(150);
        luke.setNumberOfSubordinates(16);


        System.out.println(luke.getFullName());

        System.out.println(luke.getBaseSalary());
        System.out.println(luke.getSalaryDirector());

        System.out.println(luke.getSalary(10));
        //
        System.out.println();
        //

        Employee[] corp = {john,luke,jade};
        Manager[] highCorp = {john,jerd};

        System.out.println(HW8Utilities.findEmployee(corp,"Luke Greedy"));
        System.out.println(HW8Utilities.findEmployeeForNamePart(corp,"Luke"));
        System.out.println(HW8Utilities.calculateAllSalary(corp,10));
        System.out.println(HW8Utilities.findLowestSalary(corp,10));
        System.out.println(HW8Utilities.findMaxSubsForManagers(highCorp));
        System.out.println(HW8Utilities.findMaxBonusForManagers(highCorp));
    }

//    Задача №1
//    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//    Все поля сделать приватными и для каждого поля добавить методы set и get.
//    Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за количество
//    дней которые были переданы в качестве аргумента.

//    Задача №2
//    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//    Все поля сделать приватными и для каждого поля добавить методы set и get.
//    Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за
//    количество дней которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

//    Задача №3
//    Необходимо создать класс Employee со следующими методами:
//    getName - получить имя
//    setName
//    getBaseSalary - базовая ставка
//    setBaseSalary

//    Задача №4
//    Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.
//
//    Необходимо создать класс Manager в который нужно добавить следующие методы:
//            getNumberOfSubordinates - получить количество подчиненных
//            setNumberOfSubordinates
//
//    в классе, метод getSalaryManager будет возвращать значение по формуле:
//     <базовая ставка> * (<количество подчиненных> / 100 * 3)
//    Если количество подчиненных 0, то результат как у обычного рабочего.
//
//    Необходимо создать класс Director, метод getSalaryDirector должен возвращать результат по формуле:
//    <базовая ставка> * (<количество подчиненных> / 100 * 9)
//    Если количество подчиненных 0, то результат как у обычного рабочего.


//    Задача №5
//    Необходимо создать утилитарный класс со следующими методами:
//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров

}
