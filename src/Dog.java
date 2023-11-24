import javax.xml.namespace.QName;

public class Dog extends Mammal{
boolean lovesbone;
    public Dog(String name, int age, double weight, boolean givingbirth, boolean lovesbone) {
        super(name, age, weight, givingbirth);
        this.lovesbone = lovesbone;
    }
    @Override
    public void eat() {
        System.out.println("Dogs like dog food");
    }
    @Override
    public String getVoice() {
        return "Bark!";
    }
    @Override
    public String toString() {

        return "lovesbone= " + lovesbone +
                ", givingbirth= " + givingbirth;
    }
}
