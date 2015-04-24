package edu.gemini.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard1
{

    static class Vehicle {
        @Override
        public String toString() {
            return "Vehicle{}";
        }
    }

    static class Bus extends Vehicle {
        @Override
        public String toString() {
            return "Bus{}";
        }
    }

    static class Train extends Vehicle {
        @Override
        public String toString() {
            return "Train{}";
        }
    }

    private void processElements(List<? extends Vehicle> elements) {
        for (Vehicle o : elements) {
            System.out.println(o);
        }
    }

    public static void main(String[] arg) {
        GenericWildcard1 cw1 = new GenericWildcard1();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle());
        vehicles.add(new Bus());
        vehicles.add(new Train());
        cw1.processElements(vehicles);

        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus());
        buses.add(new Bus());
        buses.add(new Bus());
        cw1.processElements(buses);


        // Строки не не будут компилироваться
        //cw1.processElements(new ArrayList<Vehicle>());
        //cw1.processElements(new ArrayList<Bus>());
        //cw3.processElements(new ArrayList<Train>());
    }
}

