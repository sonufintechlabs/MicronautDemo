package demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Employee {
    @NotNull
    @NotBlank

    String name;
    @NotNull
    @NotBlank
    int employeId;
    public Employee(){

    }
    public Employee(@NotNull @NotBlank String name, @NotNull @NotBlank int employeId) {
        this.name = name;
        this.employeId = employeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeId() {
        return employeId;
    }
    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }
}
