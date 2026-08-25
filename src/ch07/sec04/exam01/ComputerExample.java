package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator caculator = new Calculator();
        System.out.println(caculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));
    }
}
