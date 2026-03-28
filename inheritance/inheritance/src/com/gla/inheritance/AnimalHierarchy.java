package com.gla.inheritance;
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Bark Bark 🐶");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow 🐱");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp 🐦");
    }
}
class Main {
    public static void main(String[] args) {
        Animal d = new Dog("Tommy", 3);
        Animal c = new Cat("Kitty", 2);
        Animal b = new Bird("Tweety", 1);
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}