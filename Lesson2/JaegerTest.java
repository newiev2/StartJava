public class JaegerTest {

    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "2015", "Mark-1", "Destroyed", "Russia", 280, 2412, 3, 10, 10);
        System.out.println("First jaeger characteristics:");
        System.out.println("Model Name: " + chernoAlpha.getModelName());
        System.out.println("Created at: " + chernoAlpha.getCreatedAt());
        System.out.println("Mark: " + chernoAlpha.getMark());
        System.out.println("Current status: " + chernoAlpha.getStatus());
        System.out.println("Origin: " + chernoAlpha.getOrigin());
        System.out.println("Height: " + chernoAlpha.getHeight());
        System.out.println("Weight: " + chernoAlpha.getWeight());
        System.out.println("Speed: " + chernoAlpha.getSpeed());
        System.out.println("Strength: " + chernoAlpha.getStrength());
        System.out.println("Armor: " + chernoAlpha.getArmor());

        Jaeger coyoteTango = new Jaeger(null, null, null, null, null, 0, 0, 0, 0, 0);
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setCreatedAt("2015");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setStatus("Destroyed");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(280);
        coyoteTango.setWeight(2312);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
        System.out.println("Second jaeger characteristics:");
        System.out.println("Model Name: " + coyoteTango.getModelName());
        System.out.println("Created at: " + coyoteTango.getCreatedAt());
        System.out.println("Mark: " + coyoteTango.getMark());
        System.out.println("Current status: " + coyoteTango.getStatus());
        System.out.println("Origin: " + coyoteTango.getOrigin());
        System.out.println("Height: " + coyoteTango.getHeight());
        System.out.println("Weight: " + coyoteTango.getWeight());
        System.out.println("Speed: " + coyoteTango.getSpeed());
        System.out.println("Strength: " + coyoteTango.getStrength());
        System.out.println("Armor: " + coyoteTango.getArmor());

        if(chernoAlpha.getCreatedAt().equals(coyoteTango.getCreatedAt())) {
            System.out.println("First jaeger and the second one has launched at the same year.");
        } else {
            System.out.println("First jaeger and the second one has not launched at the same year.");
        }
        if(chernoAlpha.getSpeed() < coyoteTango.getSpeed()) {
            System.out.println(chernoAlpha.getModelName() + " has less speed than " + coyoteTango.getModelName());
        } else {
            System.out.println(chernoAlpha.getModelName() + " has more speed than " + coyoteTango.getModelName());
        }
    }
}