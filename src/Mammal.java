public class Mammal extends Animal implements AnimalMove{
boolean givingbirth;
    public Mammal(String name, int age, double weight, boolean givingbirth) {
        super(name, age, weight);
this.givingbirth = givingbirth;
    }

    @Override
    public void eat() { System.out.println("Mammals eat meat in general");
    }

    @Override
    public String getVoice() {
        return "Mammal voice";
    }
}
