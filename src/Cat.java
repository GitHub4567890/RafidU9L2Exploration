public class Cat extends Animal {
    private boolean hasPlayedWith;

    public Cat(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println("AAAAAAAAA");
    }
}