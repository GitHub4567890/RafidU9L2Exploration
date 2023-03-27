public class Animal {
    private String name;
    private int age;
    boolean vaccinated;

    public Animal(String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void adopt() {
        System.out.println("yhes animal approve");
    }

    public void feed() {
        System.out.println("munch munch");
    }
}