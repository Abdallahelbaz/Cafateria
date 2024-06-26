package com.example.Cafateria.Database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;


@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Employee extends User {

    @Column(unique = true)
    private Long employeeId;

    private short active;
    private String shift;
    private float salary;
    private String address;
    private String jobDescription;


    public Employee(String firstName, String lastName, Date birthDate, String email, String userName, String password, short active, String shift, float salary, String address, String jobDescription) {
        super(firstName, lastName, birthDate, email, userName, password);
        this.active = active;
        this.shift = shift;
        this.salary = salary;
        this.address = address;
        this.jobDescription = jobDescription;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public short getActive() {
        return active;
    }

    public void setActive(short active) {
        this.active = active;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", active=" + active +
                ", shift='" + shift + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
