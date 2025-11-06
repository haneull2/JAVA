class PersonalComputer{
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer){
        this.monitor = monitor;
        this.computer = computer;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor{
    String monitorSize;
    String color;
    String power;

    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.print("Turning on the monitor.\n");
    }
    public void printInfo(){
        System.out.print("The spec of the monitor\n");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class Computer{
    String cpu;
    String memory;
    String hd;
    String color;
    String power;

    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.print("Turning on the computer.\n");
    }
    public void printInfo(){
        System.out.print("The spec of the computer\n");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

public class Homework5 {
    public static void main(String[] args){
        Computer com = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor mon = new Monitor("24 inch", "Black", "45W");
        PersonalComputer pc = new PersonalComputer(mon, com);

        pc.turnOn();
        pc.printInfo();
    }
}
