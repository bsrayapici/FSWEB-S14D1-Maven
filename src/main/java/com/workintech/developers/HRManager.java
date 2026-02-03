package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 15000);
        System.out.println("HR Manager is managing employees");
    }

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Index out of bounds");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("This index already occupied");
            return;
        }
        juniorDevelopers[index] = dev;
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Index out of bounds");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("This index already occupied");
            return;
        }
        midDevelopers[index] = dev;
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Index out of bounds");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("This index already occupied");
            return;
        }
        seniorDevelopers[index] = dev;
    }
}