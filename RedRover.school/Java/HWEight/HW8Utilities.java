public final class HW8Utilities {

    //    поиск сотрудника в массиве по его имени
    public static Employee findEmployee(Employee[] employees, String name) {
        for (Employee e : employees) {
            if (e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }

    //    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findEmployeeForNamePart(Employee[] employees, String part) {
        for (Employee e : employees) {
            if (e.getName().contains(part)){
                return e;
            }
        }
        return null;
    }

    //    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double calculateAllSalary(Employee[] employees, int days) {
        double salarySum = 0;
        if (employees != null){
            for (Employee e : employees) {
                salarySum += e.getSalary(days);
            }
        }
        return salarySum;
    }

    //    поиск наименьшей зарплаты в массиве
    public static double findLowestSalary(Employee[] employees, int days) {
        if (employees != null && employees.length!=0){
            double min = employees[0].getSalary(days);
            for (Employee e : employees) {
                if (min > e.getSalary(days)){
                    min = e.getSalary(days);
                }
            }
            return min;
        }
        return 0;
    }

    //    поиск наибольшей зарплаты в массиве
    public static double findMaxSalary(Employee[] employees, int days) {
        if (employees != null && employees.length!=0){
            double min = employees[0].getSalary(days);
            for (Employee e : employees) {
                if (min < e.getSalary(days)){
                    min = e.getSalary(days);
                }
            }
            return min;
        }
        return 0;
    }

    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public static int findMinSubsForManagers(Manager[] managers) {
        if (managers != null && managers.length!=0){
            int min = managers[0].getWorkerCount();
            for (Manager m : managers) {
                if (min > m.getWorkerCount()){
                    min = m.getWorkerCount();
                }
            }
            return min;
        }
        return 0;
    }

    //    поиск наибольшего количества подчиненных в массиве менеджеров
    public static int findMaxSubsForManagers(Manager[] managers) {
        if (managers != null && managers.length!=0){
            int max = managers[0].getWorkerCount();
            for (Manager m : managers) {
                if (max < m.getWorkerCount()){
                    max = m.getWorkerCount();
                }
            }
            return max;
        }
        return 0;
    }

    //    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static double findMaxBonusForManagers(Manager[] managers) {
        if (managers != null && managers.length!=0){
            double max = managers[0].getSalaryManager();
            for (Manager m : managers) {
                if (max < m.getSalaryManager()){
                    max = m.getSalaryManager();
                }
            }
            return max;
        }
        return 0;
    }

    //    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static double findMinBonusForManagers(Manager[] managers) {
        if (managers != null && managers.length!=0){
            double min = managers[0].getSalaryManager();
            for (Manager m : managers) {
                if (min < m.getSalaryManager()){
                    min = m.getSalaryManager();
                }
            }
            return min;
        }
        return 0;
    }
}
