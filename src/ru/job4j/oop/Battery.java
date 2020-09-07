package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery enother) {
        enother.load = enother.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery durassell = new Battery(200);
        Battery energy = new Battery(150);
        System.out.println(durassell.load + " " + energy.load);
        durassell.exchange(energy);
        System.out.println(durassell.load + " " + energy.load);
    }
}
