package src;

interface Watch {
default void alarm(){
    System.out.println("Alarm is ringing");
}
}
