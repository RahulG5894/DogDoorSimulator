public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkSensor sensor = new BarkSensor(door);
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        sensor.recognize("Woof");
//        remote.pressButton();
        System.out.println("\nFido has gone outside...");
//        remote.pressButton();
        System.out.println("\nFido's all done...");
        try{
            Thread.currentThread().sleep(10000);
        } catch(InterruptedException e) {}
        System.out.println("... but he's stuck outside!");
        System.out.println("\nFido starts barking...");
//        System.out.println("...so Gina grabs the remote control.");
//        remote.pressButton();
        sensor.recognize("woof");
        System.out.println("\nFido's back inside...");
//        remote.pressButton();
    }
}
