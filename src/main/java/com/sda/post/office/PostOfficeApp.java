package com.sda.post.office;

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

    }
}
