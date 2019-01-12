package shelter;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Cat c1 = shelter.newCat("Billy", "processing",9,"male","crossbreed",
             true,"today",null);
        Cat c1s = shelter.newCat("Billy", "processing",9,"male","crossbreed",
         true,"today",null);
        Dog d1 = shelter.newDog("Jack","waiting", 5, "male", "small",
               "German Shepsherd", true, null,null);
        Dog d1s = shelter.newDog("Jik","waiting", 5, "male", "small",
                "German Shepsherd", true, null,null);
        Dog d21 = shelter.newDog("Yacht","waiting", 5, "male", "small",
                "German Shepsherd", true, null,null);
        Dog d11 = shelter.newDog("Joe","waiting", 5, "male", "small",
                "German Shepsherd", true, null,null);
        System.out.println(shelter);
    }
}
