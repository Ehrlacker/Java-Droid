/**
This is a program that creates a droid that I can command */
public class Droid{

    int batteryLevel;
    String name;
    
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
    
    public String toString(){
      return "Hello, I am" + name;
    }
    
    public void performTask(String task){
    System.out.println(name + " is performing " + task);
    batteryLevel = batteryLevel - 10;
    }
    
    public void batteryLevel(int level){
      System.out.println("I have  " + level + "% battery left!");
    }
    
      public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey.name);
    Codey.performTask("cleaning");
    Codey.batteryLevel(45);
      }
    }