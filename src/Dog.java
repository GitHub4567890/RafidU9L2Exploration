public class Dog extends Animal {
    private boolean hasBeenWalked;

    public Dog(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public void walk() {
        hasBeenWalked = true;
        System.out.println("i walk");
    }

}