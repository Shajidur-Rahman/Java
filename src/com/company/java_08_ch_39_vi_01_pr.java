package com.company;
class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
}
public class java_08_ch_39_vi_01_pr {
    public static void main(String[] args) {
        employee employee = new employee();
        employee.salary = 23;
        employee.name = "Shajidur";
        employee.setName("Rahman");
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
