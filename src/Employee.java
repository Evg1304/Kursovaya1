public class Employee {

    private static int counter = 0;
    private  Integer id;
    private  String name;
    private  String lastName;
    private  String middleName;
    private int department;
    private int salary;

    public Employee(String name, String lastName, String middleName, int department, int salary){
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public int getDepartment(){
        return department;
    }
    public int getSalary(){
        return salary;
    }
    public int getId(){
        return this.id;
    }
    public void setDepartment(byte department){
    this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString(){
        return "Employee{" +
                "Id='" + id + "\'" +
                " , Имя='" + name + "\'" +
                " , Фамилия='" + lastName + "\'" +
                " , Отчество='" + middleName + "\'" +
                " , Отдел='" + department +
                " , Зарплата='" + salary +
                "}";

    }



}
