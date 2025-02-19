package src;

public abstract class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
    public void call(String phoneNum){
        System.out.println("You are calling: "+phoneNum);
    }
}
