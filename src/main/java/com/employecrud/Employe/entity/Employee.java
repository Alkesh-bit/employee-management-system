package com.employecrud.Employe.entity;
import jakarta.persistence.*;

@Entity
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private Double salary;
    
    public Employee(){

    }
    public Employee(long id,String name,String email,Double salary){
        this.id=id;
        this.name= name;
        this.email=email;
        this.salary=salary;

    }

    public Long getId(){
        return id;
    }
    public void setId(){
        this.id= id;

    }
    public String getname (){
        return name;

    }
    public void setname(){
        this.name= name;

    }
    public String getemail(){
        return email;
    }
    public void setemail(){
        this.email=email;
    }
    public Double getsalary(){
        return salary;

    }
    public void setsalary(){
        this.salary= salary;
    }

}
