

public class LearnInterfaces {
    public static void main(String args[]) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
    }
}

interface Animal {
    void eats();
}

interface Pet {
    void sings();
}

class Monkey implements Animal, Pet {
    @Override
    public void sings() {
        System.out.println("Monkey is singing ");
    }

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }
}
