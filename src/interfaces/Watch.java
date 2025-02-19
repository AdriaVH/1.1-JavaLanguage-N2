package src.interfaces;

public interface Watch {
default void alarm(){
    System.out.println("Alarm is ringing");
}
}
