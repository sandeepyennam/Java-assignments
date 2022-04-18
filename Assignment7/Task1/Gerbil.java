package Assignment7.Task1;

import Assignment7.Task1.Rodent;

public  class Gerbil extends Rodent {

    public Gerbil() {
        System.out.println("This is Gerbil");
    }

    @Override
    public void sleep() {
        System.out.println("They will sleep in day and night");
    }

    @Override
    public void nature() {
        System.out.println("\n" +
                "Gerbils are very social animals, and it is best to keep them in pairs or groups. ");
    }

    @Override
    public void liveIn() {
        System.out.println("These usally live  in clay or sandy deserts, grasslands, scrub, arid steppes, and mountain valleys.");

    }
}