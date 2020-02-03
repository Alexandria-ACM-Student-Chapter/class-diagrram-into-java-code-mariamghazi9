/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Emloyee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Emloyee(int id,String firstName,String lastName,int salary)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return getFirstName()+getLastName();
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary+(salary*percent);
    }
    public String toString(){
        return "id= "+getID()+"name= "+getName()+"salary= "+getSalary();
    }
}
