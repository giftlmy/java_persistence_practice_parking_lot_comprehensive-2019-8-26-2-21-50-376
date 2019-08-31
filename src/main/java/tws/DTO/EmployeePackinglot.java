package tws.DTO;

import tws.entity.PackingLot;

public class EmployeePackinglot {
    private String employeeID;
    private PackingLot packingLot;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public PackingLot getPackingLot() {
        return packingLot;
    }

    public void setPackingLot(PackingLot packingLot) {
        this.packingLot = packingLot;
    }

    @Override
    public String toString() {
        return "EmployeePackinglot{" +
                "employeeID='" + employeeID + '\'' +
                ", packingLot=" + packingLot +
                '}';
    }
}
