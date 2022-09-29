package it.unibo.tdd;

public class Tv {
    boolean on;

    public Tv(){
        this.on = false;
    }

    public void turnOn(){ 
        this.on = true;
    }

    public void turnOff(){
        this.on = false;
    }

    public boolean isOn(){ 
        return on; 
    }
}