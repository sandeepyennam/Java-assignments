package Assignment7.Task1;

import Assignment7.Task1.Rodent;

public class Hamster extends Rodent {
    public Hamster()
    {
        System.out.println("This is the Hamster");
    }
    @Override
    public void sleep() {
        System.out.println("These are nocturnal,sleep at nights");
    }

    @Override
    public void nature() {
        System.out.println("Some hamsters are very social, while others are loners. For example, the Syrian hamster doesn't like living near other hamsters");
    }

    @Override
    public void liveIn() {
        System.out.println("for living they dig burrows, which are a series of tunnels, to live and breed in");
    }
}
