
interface Animal {
    void makeSound();
}

interface Mammal extends Animal {
    void giveBirth();
}

interface Bird extends Animal {
    void layEggs();
}


class Bat implements Mammal, Bird {
    
    @Override
    public void makeSound() {
        System.out.println("Bat makes a high-pitched sound.");
    }

    
    @Override
    public void giveBirth() {
        System.out.println("Bat gives birth to live young.");
    }
    @Override
    public void layEggs() {
        System.out.println("Bat lays eggs.");
    }
}

public class Diamondproblem {
    public static void main(String[] args) {
        
        Bat bat = new Bat();

        
        bat.makeSound();
        bat.giveBirth();
        bat.layEggs();
    }
}
