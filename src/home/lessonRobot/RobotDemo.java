package home.lessonRobot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot person1= new Robot();
        Robot person2= new Robot();
        Robot person3= new Robot();

        person1.name = "Robo";
        person1.town = "Kharkiv";
        person2.name = "Valli";
        person2.town = "Dnipro";
        person3.name = "Cezar";
        person3.town = "Lviv";

        person1.greeting();
        person2.greeting();
        person3.greeting();

        System.out.println(person1.name +(" Live in ") + person1.town);
        System.out.println(person2.name +(" Live in ") + person2.town);
        System.out.println(person3.name  +(" Live in ") + person3.town);






    }
}
