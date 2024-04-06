package pl.pjatk.dawlit;

public class Car {

    private int makeYear;
    private String name;
    private Boolean aBoolean;

    public Car(){
        this.makeYear=2000;
        this.name="car1";
        this.aBoolean=true;
    }
    public Car(int makeYear, String name, Boolean aBoolean){
        this.makeYear=makeYear;
        this.name=name;
        this.aBoolean=aBoolean;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public String getName() {
        return name;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }
}
