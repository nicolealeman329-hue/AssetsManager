package org.example;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String decscription, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(decscription, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
@Override
    public double getValue(){
        double rate;

        if(condition == 1 ){
            rate = 180.0;
        }else if (condition == 2){
            rate = 130.0;
        }else if (condition == 3){
            rate = 90.0;
        }else if(condition == 4 ){
            rate = 80.0;
        }else{
            rate = 0.0;
        }
        return(squareFoot * rate)+(lotSize*0.25);
}

}
