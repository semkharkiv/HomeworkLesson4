package home.lessonRobot;


public class Robot {



    public void greeting() {
        System.out.println("Hello!My name is -" +name);

    }
    String name;



    String town;



    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", town='" + town + '\'' +

                '}';
    }


}

