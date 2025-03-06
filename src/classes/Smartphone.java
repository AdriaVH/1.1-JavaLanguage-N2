package src.classes;

import src.interfaces.Camera;
import src.interfaces.Watch;

public class Smartphone extends Phone implements Camera, Watch {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void takePicture() {
        System.out.println("Taking a picture, smile!");
    }
    @Override
    public void alarm() {
        System.out.println("Alarm is ringing");
    }
    @Override
    public void call(String phoneNum) {
        super.call(phoneNum);
    }
}
