package EmployeeAgg;

public class Employee {

    private final int idNumber;
    private final String fullName;
    private final String phoneNumber;

    EmployeeAddress e1; //Aggregation

    public Employee(int idNumber, String fullName, String phoneNumber) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        e1 = new EmployeeAddress("Condor St", "Mons-pi", "Toronto", 894, "Canada");
    }

    String showEmployee() {
        System.out.println(
                "Name : " + fullName + " Id Number : " + idNumber + " Phone Number : " + phoneNumber + " City : "  + e1.getCity());
        return null;
    }
}
