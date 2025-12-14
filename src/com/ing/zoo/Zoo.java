package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Wolf alex = new Wolf("alex");
        Elephant gloria = new Elephant("gloria");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        if (input.startsWith(commands[0])) {
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                String name = parts[1];
                switch (name) {
                    case "henk": henk.sayHello(); break;
                    case "elsa": elsa.sayHello(); break;
                    case "dora": dora.sayHello(); break;
                    case "wally": wally.sayHello(); break;
                    case "marty": marty.sayHello(); break;
                    case "alex": alex.sayHello(); break;
                    case "gloria": gloria.sayHello(); break;
                    default: System.out.println("Unknown animal: " + name); break;
                }
            } else {
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
                alex.sayHello();
                gloria.sayHello();
            }
        } else if (input.startsWith(commands[1])) {
            String[] parts = input.split(" ", 3);
            if (parts.length == 3) {
                String name = parts[2];
                switch (name) {
                    case "henk": henk.eatLeaves(); break;
                    case "elsa": elsa.eatLeaves(); break;
                    case "dora": dora.eatLeaves(); break;
                    case "wally": wally.eatLeaves(); break;
                    case "marty": marty.eatLeaves(); break;
                    case "alex": alex.eatLeaves(); break;
                    case "gloria": gloria.eatLeaves(); break;
                    default: System.out.println("Unknown animal: " + name); break;
                }
            } else {
                elsa.eatLeaves();
                dora.eatLeaves();
                marty.eatLeaves();
                gloria.eatLeaves();
            }
        } else if (input.startsWith(commands[2])) {
            String[] parts = input.split(" ", 3);
            if (parts.length == 3) {
                String name = parts[2];
                switch (name) {
                    case "henk": henk.eatMeat(); break;
                    case "elsa": elsa.eatMeat(); break;
                    case "dora": dora.eatMeat(); break;
                    case "wally": wally.eatMeat(); break;
                    case "marty": marty.eatMeat(); break;
                    case "alex": alex.eatMeat(); break;
                    case "gloria": gloria.eatMeat(); break;
                    default: System.out.println("Unknown animal: " + name); break;
                }
            } else {
                henk.eatMeat();
                wally.eatMeat();
                alex.eatMeat();
            }
        } else if (input.startsWith(commands[3])) {
            String[] parts = input.split(" ", 3);
            if (parts.length == 3) {
                String name = parts[2];
                switch (name) {
                    case "henk": henk.performTrick(); break;
                    case "elsa": elsa.performTrick(); break;
                    case "dora": dora.performTrick(); break;
                    case "wally": wally.performTrick(); break;
                    case "marty": marty.performTrick(); break;
                    case "alex": alex.performTrick(); break;
                    case "gloria": gloria.performTrick(); break;
                    default: System.out.println("Unknown animal: " + name); break;
                }
            } else {
                dora.performTrick();
                wally.performTrick();
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}