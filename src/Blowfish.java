public class Blowfish extends Fish{
    boolean blowsup;
    public Blowfish(String name, int age, double weight, boolean abletobreath, boolean blowsup) {
        super(name, age, weight, abletobreath);
        this.blowsup = blowsup;
    }

    @Override
    public void eat() {
        System.out.println("Blowfishes eats sea plants.");
    }

    @Override
    public String getVoice() {
        return "No special voices";
    }
}
