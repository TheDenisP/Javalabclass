
    public abstract class Animal {
        private String name;
        private int age;
        private double weight;

        public Animal(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public abstract void eat();

        public abstract String getVoice();

        @Override
        public String toString() {
            return "Animal name= " + name + ", age=" + age + ", weight=" + weight + " ";
        }
    }
