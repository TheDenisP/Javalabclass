public class Pigeon extends Bird{

    String species;
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeons eat fishes");
    }

    @Override
    public String getVoice() {
        return super.getVoice();
    }
}
