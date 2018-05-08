
package entity;

import java.util.Random;
public class Bee {
    private String type;
    private byte health;
    private boolean alive;

    public Bee() {
        health = 100;
        alive = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
        //update the alive status when the health value changed
       if(this instanceof WorkerBee && health<70) alive = false;
       if(this instanceof Drone && health<50) alive = false;
       if(this instanceof QueenBee && health<20) alive = false;
    }   
    
    public boolean isAlive(){
        return this.alive;
    }  

    //attack this bee
    public void damage() {
        Random ran = new Random();
        int damage = ran.nextInt(this.health+1);
        if(this.alive==true) {
        	byte health = (byte) (this.health-damage);
            this.setHealth(health);
        }
    }

    @Override
    public String toString() {
        String beeDetails ="Bee details";
        String alive = "alive";
        if(this.alive==false) alive = "dead";
        beeDetails = String.format("%-10s %10d %10s", this.type, this.health, alive);
        return beeDetails;
    }
}
