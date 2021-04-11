package com.dicoding.javafundamental.generics;

class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
