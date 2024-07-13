// keeping it in a single class causes some problem cause every function in a module has it's very own unique property so changes within the function should not affect the other functions 


class singleresponsibility {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe");

        SalaryCalculator.calculateSalary(employee);
        HoursCalculator.calculateHours(employee);
        EmployeeRepository.saveEmpData(employee);
    }
}
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class SalaryCalculator {
    public static void calculateSalary(Employee employee) {
        System.out.println("Calculating salary for " + employee.getName());
    }
}

class HoursCalculator {
    public static void calculateHours(Employee employee) {
        System.out.println("Calculating hours for " + employee.getName());
    }
}

class EmployeeRepository {
    public static void saveEmpData(Employee employee) {
        System.out.println("Saving data for " + employee.getName());
    }
}