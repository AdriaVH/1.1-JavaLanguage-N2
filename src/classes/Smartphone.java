package src.classes;

import src.interfaces.Camera;
import src.interfaces.Watch;

public class Smartphone extends Phone implements Camera, Watch {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void takePicture() {
        Camera.super.takePicture();
    }
    @Override
    public void alarm() {
        Watch.super.alarm();
    }
    @Override
    public void call(String phoneNum) {
        super.call(phoneNum);
    }
}
