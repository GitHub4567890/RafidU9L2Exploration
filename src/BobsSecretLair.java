public class BobsSecretLair {
    public static void main(String[] args) {
        Dog dogUno = new Dog("uno", 333, false);
        System.out.println("Dog Uno Info:\nname: " + dogUno.getName() + "\nage: " + dogUno.getAge() + "\nvaccination status: " + dogUno.isVaccinated() + "\nwalked: " + dogUno.isHasBeenWalked());
        dogUno.adopt();
        dogUno.feed();
        dogUno.walk();
        System.out.println("walked: " + dogUno.isHasBeenWalked());

        System.out.println();

        Cat cartDos = new Cat("dos", 333, true);
        System.out.println("Cart Dos Info:\nname: " + cartDos.getName() + "\nage: " + cartDos.getAge() + "\nvaccination status: " + cartDos.isVaccinated() + "\nplayed with: " + cartDos.isHasPlayedWith());
        cartDos.adopt();
        cartDos.feed();
        cartDos.play();
        System.out.println("played with: " + cartDos.isHasPlayedWith());
    }
}