package wildcards;

import types.PairContainer;

public class WildcardsApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        PairContainer<Integer, Animal> container1 = new PairContainer<>(1, animal);
        PairContainer <Integer, Cat> container2 = new PairContainer<>(1, cat);
        PairContainer <Integer, Dog> container3 = new PairContainer<>(1, dog);

        WildcardsApp.<Animal>copyValue(container1, container1); // откуда -> куда
        WildcardsApp.<Animal>copyValue(container2, container1);

    }

    public static <T> void copyValue
            (PairContainer<Integer, ? extends T> from, // откуда (потомки)
             PairContainer<Integer, ? super T> to // куда (предки)
            ){
        // предположим, что Т - Animal
        // ? extends Т - тип Animal и все его потомки, т.е. Cat и Dog
        // ? super Т - тип Animal и все его потомки, т.е. Object
        to.setValue(from.getValue());
    }
}
