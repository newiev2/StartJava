public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.name = "Axel";
        wolf1.sex = "Male";
        wolf1.color = "Grey";
        wolf1.age = 4;
        wolf1.weight = 17.3F;

        System.out.println("name: " + wolf1.name);
        System.out.println("sex: " + wolf1.sex);
        System.out.println("color: " + wolf1.color);
        System.out.println("age: " + wolf1.age);
        System.out.println("weight: " + wolf1.weight);
        wolf1.move();
        wolf1.run();
        wolf1.sit();
        wolf1.howl();
        wolf1.hunt();
    }
}