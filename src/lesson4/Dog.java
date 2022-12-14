package lesson4;

public class Dog {

    String name;

    String bread;

    int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                '}';
    }

    public void voice (String voice){

        System.out.println(voice);

    }

}
