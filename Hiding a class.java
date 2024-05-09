package com.example.project;

class InnerClass { // package-private class, not accessible outside 'com.example.project' package
    void display() {
        System.out.println("Hello from Inner Class!");
    }
}

public class Main {
    public static void main(String[] args) {
        InnerClass obj = new InnerClass(); // corrected variable name and instantiation
        obj.display();
    }
}
