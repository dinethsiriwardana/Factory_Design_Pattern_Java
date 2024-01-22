package FactoryDesignPattern;

import java.util.Objects;

public class SelectNetworkFactory {

    static CellularPlan getPlan(String planType){
        if (planType.isEmpty()){
            return null;
        }else
       if (planType.equalsIgnoreCase("abc")){
           return new AbcNetwork();
       }else if (planType.equalsIgnoreCase("pqr")){
            return new PqrNetwork();
        }else if (planType.equalsIgnoreCase("xyz")){
           return new XyzNetwork();
       }else{
           return null;
       }
    }
}
