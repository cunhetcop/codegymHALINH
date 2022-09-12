package lopthuoctinhdoituong.kethua;

public class main {
    public static void main(String[] args) {
        Anthit anthit = new Anthit();
        Animal animal = new Animal("báo",15,"male",59.0f);

        System.out.println(animal.getAge());
        System.out.println(anthit.getAge());
    }
}
