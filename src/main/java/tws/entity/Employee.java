package tws.entity;

import java.io.Serializable;

public class Employee implements Serializable {
    private String employeeID;


    public Employee() {

    }
    public Employee(String id, String name, String age) {
        this.employeeID = id;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }


}
