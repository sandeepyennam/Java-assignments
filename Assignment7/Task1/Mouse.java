package Assignment7.Task1;

import Assignment7.Task1.Rodent;

public class Mouse extends Rodent {
    public Mouse()
    {
        System.out.println("This is Mouse");
    }

    @Override
    public void  sleep() {
        System.out.println("These will usually sleep during nights");
    }

    @Override
   public void nature() {
        System.out.println("These are dwellers,climbers and leapers");
    }

    @Override
    public void liveIn() {
        System.out.println("These will usually sleep in wall voids, storage boxes, attics, barns");

    }
}
