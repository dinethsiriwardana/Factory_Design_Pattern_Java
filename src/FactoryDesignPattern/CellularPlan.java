package FactoryDesignPattern;

abstract class CellularPlan {
     protected double rate;

    abstract void getRate();

    double processBill(int minutes){
        return rate * minutes;
    }
}
