public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Animal an1 = shelter.newAnimal("Dog");
        System.out.println(shelter);
    }
}
