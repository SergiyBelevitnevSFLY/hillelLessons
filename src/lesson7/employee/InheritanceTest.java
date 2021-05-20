package lesson7.employee;

public class InheritanceTest {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setAge(25);
        employee.setTitle("Trainee");
        employee.setGender("Man");
        employee.setName("John");
        employee.setEmployeeId("324");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getTitle());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getName());

        Vendor vendor = new Vendor();
        vendor.setSubContractId("123442");
//        vendor.
    }
}
