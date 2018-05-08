
package business;

import entity.QueenBee;
import entity.Bee;
import entity.WorkerBee;
import entity.Drone;
import java.util.ArrayList;
import java.util.Random;

public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init() {
        //create list of 10 bees  of Queen, Drone and Worker types
        //in each bee, type and health attributes are randomly chosen
        this.listBee = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        	Random ran = new Random();
            int choice = ran.nextInt(3);
            if(choice==0) listBee.add(new WorkerBee());
            if(choice==1) listBee.add(new QueenBee());
            if(choice==2) listBee.add(new Drone());
		}
    }

    public ArrayList<Bee> getAllBees() {
        return listBee;
    }
    //attach all bees
    public void attackBees() {
        for (Bee b : listBee) {
			b.damage();
		}
    }
}
