package Objorient;

class Vehicles{
    private String name;
    private int speed;
    private String direction;

    public Vehicles(String name, int speed, String direction) {
        this.name = name;
        this.speed = speed;
        this.direction = direction;
    }

    public void turns(String currentdirection){
        this.direction=currentdirection;
        System.out.println(getName() + " is moving in "+ getDirection() + " direction.");
    }
    public void stop(){
        this.speed=0;
        System.out.println("Vehicle Stopped");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}

class Cars3 extends Vehicles{
    private int wheels;
    private int doors;
    private String color;
    private int gears;
    private int currentGear;

    public Cars3(String name, int speed, String direction, int wheels, int doors, String color, int gears, int currentGear) {
        super(name, speed, direction);
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("ChangeGear method called: Changed to " + this.currentGear + " gear");
    }


}

class  Ferrari extends Cars3{

    public Ferrari(String name, int speed, String direction, int wheels, int doors, String color, int gears, int currentGear) {
        super(name, speed, direction, wheels, doors, color, gears, currentGear);
    }

    public void accelarate(int rate){
        int newSpeed = getSpeed();  //+ rate ;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
                changeGear(1);
            } else if (newSpeed > 10 && newSpeed <= 20) {
                changeGear(2);
            } else if (newSpeed > 20 && newSpeed <= 30) {
                changeGear(3);
            } else if (newSpeed > 30 && newSpeed <= 40) {
                changeGear(4);
            } else if (newSpeed > 40 && newSpeed <= 50) {
                changeGear(5);
            } else if (newSpeed > 50 && newSpeed <= 60) {
                changeGear(6);
            } else if (newSpeed > 60 && newSpeed <= 70) {
                changeGear(7);
            } else if (newSpeed > 70 && newSpeed <= 80) {
                changeGear(8);
            } else if (newSpeed > 80 && newSpeed <= 90) {
                changeGear(9);
            } else if (newSpeed > 90 && newSpeed <= 100) {
                changeGear(10);
            }
        }
        }






public class VehicleInheritanceProject {
    public static void main(String[] args) {
        Ferrari supercar = new Ferrari("Supercar",60,"left",4,4,
                "Red",10,2);
        supercar.turns("left");
       // supercar.changeGear(3);
        supercar.accelarate(30);



    }
}
