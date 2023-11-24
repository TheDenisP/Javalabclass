public class Bird extends Animal {
    String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }



    @Override
    public void eat() {
        System.out.println("Bird species eat vegetables, plants and meat types");

    }
        @Override
        public String getVoice() {
            return "Bird voice";
        }

}
