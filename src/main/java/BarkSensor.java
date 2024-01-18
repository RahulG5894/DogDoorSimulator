public class BarkSensor {
    private DogDoor door;
    public BarkSensor(DogDoor door) {
        this.door = door;
    }
    public void recognize(String bark) {
        System.out.println("  BarkSensor: Heard a '"+ bark + "'");
        door.open();
    }
}
