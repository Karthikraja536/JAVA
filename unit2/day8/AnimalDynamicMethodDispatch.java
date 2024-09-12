class Animal {
void makeSound() {
    System.out.println("Animal makes a sound");
}
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}


class AnimalDynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();

        a.makeSound();
    }
}