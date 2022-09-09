public class Person {
String name;
int age;
    public Person(){
        name = "Noname";
        age = 10;
    }

    public Person (String inputname, int inputAge) {
        name = inputname;
        age = inputAge;
    }
    public String sayHello(){
        return "Hello, I'm " + name;
    }
    }


