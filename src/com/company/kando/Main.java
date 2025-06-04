package com.company.kando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static boolean isRunningTest = false;
    public static String testInputPassangerName;

    public static List<FlightPassanger> flightPassangerList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        //1.
        flightPassangerList = new ArrayList<>();
        File fin = new File("funny-airlines.csv");
        Scanner scanner = new Scanner(fin);
        String firstLine = scanner.nextLine();
        while (scanner.hasNextLine()) {
            String fileLine = scanner.nextLine();
            flightPassangerList.add(new FlightPassanger(fileLine));
        }

        System.out.println("1. Adatok beolvasva.");

        //2.
        System.out.println("2. Különböző járatok száma: "+flightPassangerList.size());

        //3.
        Set<Integer> passengerIds = new HashSet<>();
        for(FlightPassanger f : flightPassangerList){
            passengerIds.add((f.PassangerId));
        }

        System.out.println("3. Egyedi utasok száma: " + passengerIds.size());

        //4.
        int sumOfJegyek = 0;
        for(FlightPassanger f : flightPassangerList){
            sumOfJegyek += f.Price;
        }

        System.out.println("4. A jegyek összértéke: " + sumOfJegyek + "Ft.");

        FlightPassanger legdragabb = flightPassangerList.get(0);
        for(FlightPassanger f : flightPassangerList){
            if(legdragabb.Price < f.Price){
                legdragabb = f;
            }
        }
//5.
        System.out.println("5. Legdrágább jegy: ");
        System.out.println("Utas neve: " + legdragabb.PassangerName);
        System.out.println("Utas azonosító: " + legdragabb.PassangerId);
        System.out.println("Járatszám: " + legdragabb.FlightNumber);
        System.out.println("Ár: " + +legdragabb.Price + "Ft");

        //6.
        System.out.println("6. Budapestre tartó járatok:");
        List<FlightPassanger> bpre = new ArrayList<>();
        for(FlightPassanger f : flightPassangerList){
            if(f.Destination.equals("Budapest")){
                bpre.add(f);
                System.out.println("FlightNumber: " + f.FlightNumber + ", Source: " + f.Source + ", Passanger: " + f.PassangerName + ", PassangerId: " + f.PassangerId + ", Price: " + f.Price + " HUF");
            }
        }
    //7.
        System.out.println("7. Jegyek átlagára: " + Math.round(sumOfJegyek/(double)flightPassangerList.size()));

    //8.
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("8. Kérem az utas nevét: ");
        String nev = isRunningTest ? testInputPassangerName : scanner1.nextLine();
        int jegydb = 0;
        int passangerId = 0;
        List<String> jaratai = new ArrayList<>();
        for(FlightPassanger f : flightPassangerList){
            if(f.PassangerName.toUpperCase().equals(nev.toUpperCase())){
                jegydb++;
                jaratai.add(f.FlightNumber);
                passangerId = f.PassangerId;
            }
        }
        if(passangerId>0){
            System.out.println(nev + " ("+passangerId+") jegyeinek száma: " + jegydb);
            System.out.print("Járatai: ");
            for(String j : jaratai){
                if(!jaratai.get(jaratai.size()-1).equals(j)){
                    System.out.print(j + ", ");
                }else{
                    System.out.println(j);
                }

            }
        }else {
            System.out.println("Ilyen utasnév nem található!");
        }



    }
}
