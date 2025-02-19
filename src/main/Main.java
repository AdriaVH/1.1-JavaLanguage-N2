package src.main;

import src.classes.Smartphone;

public class Main {

    public static void main(String[] args) {
    Smartphone mySmartphone = new Smartphone("Nokia", "1200");
    mySmartphone.alarm();
    mySmartphone.takePicture();
    mySmartphone.call("644897412");
    }
}