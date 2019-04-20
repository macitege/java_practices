public class Dog {

    int age;
    String breed;
    String sex;
    boolean isPregnant;

    public Dog (
            int inputAge,
            String inputBreed,
            String inputSex,
            boolean inputIsPregnant
    ) {
        this.age = inputAge;
        this.breed = inputBreed;
        this.sex = inputSex;
        this.isPregnant = inputIsPregnant;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void bark () {
        System.out.println("Bark, bark, barkk.....htrrrrrrr!!");
    }

    public int yearPass (int years) {
        this.age += years;
        return this.age;
    }
}
