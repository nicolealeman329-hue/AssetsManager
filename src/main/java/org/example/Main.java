package org.example;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ArrayList<Asset>assets = new ArrayList<>();
assets.add(new House("Vacay Home","2024-10-16",300000,"123 Elm St",1,3000,5000) );

assets.add(new Vehicle("My Car","2021-03-05",20000,"Honda Civic",2018,100000));

for (Asset a : assets ){
    System.out.println("Description: "+ a.getDescription());
    System.out.println("Date: "+ a.getDateAcquired());
    System.out.println("Original Cost: "+ a.getOriginalCost());
    System.out.println("Current Value: "+ a.getValue());

    if(a instanceof House) {
        House h = (House) a;
        System.out.println("House Address:" + h.getAddress());
    }else if (a instanceof Vehicle){
        Vehicle v = (Vehicle ) a;
        System.out.println("Vehicle: "+ v.getYear()+ ""+ v.getMakeModel());
    }
    System.out.println("---------- Thank You!------------");
}

    }
}