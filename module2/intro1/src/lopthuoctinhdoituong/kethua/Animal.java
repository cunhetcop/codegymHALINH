package lopthuoctinhdoituong.kethua;
public class Animal {
    private String name;
    private int age =10;
    private String gender;
    private float weight;


    public Animal(String name, int age, String gender, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("ăn thịt");
    }

    public void run(){
        System.out.println("chạy như ma đuổi");
    }

    public void bark(){
        System.out.println("meo meo");
    }

    public String getName(String name){
        return name;
    }

    public void setName( String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge ( int age){
        this.age=age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(){
        this.gender=gender;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight( float weight){
        this.weight=weight;
    }
}

