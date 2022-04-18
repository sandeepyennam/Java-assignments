package Assignment7.Task1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        //creating object of Mouse and calling the methods
        rodents[0]=new Mouse();
        rodents[0].sleep();
        rodents[0].liveIn();
        rodents[0].nature();
        //creating the object of gerbil and calling the methods
        rodents[1]=new Gerbil();
        rodents[1].sleep();
        rodents[1].liveIn();
        rodents[1].nature();
        //creating the object of Hamster and calling its methods
        rodents[2]=new Hamster();
        rodents[2].sleep();
        rodents[2].liveIn();
        rodents[2].nature();
    }
}
