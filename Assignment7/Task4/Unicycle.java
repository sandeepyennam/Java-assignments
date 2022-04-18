package Assignment7.Task4;

public class Unicycle implements Cycle{
    @Override
    public void Wheels() {
        System.out.println("It will have only one wheel");
    }

    @Override
    public void difficultyLevel() {
        System.out.println("Difficuly level of this is high,due to less balance");
    }
}
