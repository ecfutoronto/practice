package com.company;

public class Person {
    private String name;
    private int age;
    private String sex;
    private double income;

    public Person(String name, int age, String sex, double income)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.income = income;
    }

    public void personPrint()
    {
        System.out.println("The person's name is " + this.name + ".");
        if (this.sex == "M")
            System.out.println("He makes $" + this.income + " annually and is " + this.age + " years old");
        else
            System.out.println("She makes $" + this.income + " annually and is " + this.age + " years old");

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public void setIncome(double income)
    {
        this.income = income;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getSex()
    {
        return this.sex;
    }

    public double getIncome()
    {
        return this.income;
    }

}
