class person{
    private String name;
    private int age;

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class employees extends person {
    private String employeeID;
    private String department;

    public employees(String name, int age, String employeeID, String department) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Employee ID:" + getEmployeeID());
        System.out.println("Department:" + getDepartment());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        employees e1 = new employees("karthik", 18, "E23110026", "CSE-AIML");

        e1.display();
    }
}
