package tws.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Employee implements Serializable {
    @NotNull(message = "不能为空哦")
    private String employeeID;


    public Employee() {

    }

    public Employee( String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }


}
