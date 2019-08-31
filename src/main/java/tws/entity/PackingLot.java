package tws.entity;

public class PackingLot {
    private String parkinglotID;
    private Integer capacity;
    private Integer availablePositionCount;
    private String employeeID;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getParkinglotID() {
        return parkinglotID;
    }

    public void setParkinglotID(String parkinglotID) {
        this.parkinglotID = parkinglotID;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAvailablePositionCount() {
        return availablePositionCount;
    }

    public void setAvailablePositionCount(Integer availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }

    public PackingLot(String parkinglotID, Integer capacity, Integer availablePositionCount, String employeeID) {
        this.parkinglotID = parkinglotID;
        this.capacity = capacity;
        this.availablePositionCount = availablePositionCount;
        this.employeeID = employeeID;
    }
}
