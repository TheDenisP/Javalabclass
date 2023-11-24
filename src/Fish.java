public class Fish extends Animal{
    Boolean abletobreath;
    public Fish(String name, int age, double weight, boolean abletobreath) {
        super(name, age, weight);
        this.abletobreath = abletobreath;
    }

    @Override
    public void eat() {
        System.out.println("Fishes eat fishes");
    }

    @Override
    public String getVoice() {
        return "No special voices";
    }
}
