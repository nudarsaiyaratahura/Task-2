//Method with parameters
public class Car  {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void model() {
        System.out.println("The " + color + " Car model.");
    }

}
public class Toyota  {
    private String color;

    public Toyota(String color) {
        this.color = color;
    }

    public void model() {
        System.out.println("The " + color + " Car model.");
    }

}

// Main
    public class  Main 
{
    public static void main(String[] args) {
        Bmw blueBmw = new Bmw("Red");
        blueBmw.model();
        blueBmw.style();

        System.out.println();
        Mercedes redMerdeces = new Mercedes("Red");
        redMerdeces.model();
        redMerdeces.style();
    }
}