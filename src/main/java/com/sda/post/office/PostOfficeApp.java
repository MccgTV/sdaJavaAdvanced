package com.sda.post.office;

import java.time.LocalDate;
import java.time.Month;

public class PostOfficeApp {

    public static void main(String[] args) {

        PackageStatus sent = PackageStatus.SENT;
        PackageStatus travelling = PackageStatus.TRAVELLING;
        PackageStatus courier = PackageStatus.COURIER;
        PackageStatus delivered = PackageStatus.DELIVERED;
        PackageStatus lost = PackageStatus.LOST;
        PackageStatus returned = PackageStatus.RETURNED;

        Package newPackage = new Package(PackageStatus.SENT, "Elektronika");
        System.out.println(newPackage);

        newPackage.setStatus(PackageStatus.DELIVERED);
        System.out.println(newPackage);

        PackageStatus[] packageStatuses = PackageStatus.values();
        for (PackageStatus packageStatus : packageStatuses) {
            System.out.println(packageStatus);
        }

        PackageStatus packageStatus = PackageStatus.valueOf("LOST");
        System.out.println(packageStatus);
// Przykladowe uzycie enum

        LocalDate data = LocalDate.of(1992, Month.DECEMBER, 12);
        Month september = Month.of(9);
        System.out.println(september);


        //Uzycie statycznej metody enum
        PackageStatus[] errorStatuses = PackageStatus.getErrorStatuses();
        for (PackageStatus obiekt : errorStatuses) {
            System.out.println(obiekt);
        }

        //Uzycie niestatycznej metody enum
        System.out.println(PackageStatus.LOST.isError());
        System.out.println(PackageStatus.SENT.isError());
    }
}
