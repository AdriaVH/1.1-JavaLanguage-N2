interface Camera {
    default void takePicture(){
        System.out.println("Taking a picture, smile!");
    }
}
