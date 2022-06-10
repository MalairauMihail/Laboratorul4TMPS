package DepedencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {
        PersonInterface owner = Factory.createPerson();
        owner.setFirstName("Mihai");
        owner.setLastName("Malairau");
        owner.setEmailAddress("str.studentilor 7");
        owner.setPhoneNumber("69125124");

        TaskInterface task = Factory.createTask();
        task.setTaskDescription("Partea de back-end pentru un site Ecommerce.");
        task.setOwner(owner);

        task.performedWork(1);
        task.performedWork(0.5);
        task.completeTask();
    }
}
