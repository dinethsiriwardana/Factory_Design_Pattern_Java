package FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Network Name (abc/pqr/xyz): ");
        String networkName = reader.readLine();
        System.out.print("Enter Minutes of Usage: ");
        int minutes = Integer.parseInt(reader.readLine());

        CellularPlan plan = SelectNetworkFactory.getPlan(networkName);
            plan.getRate();
            System.out.println(plan.processBill(minutes));
    }
}
