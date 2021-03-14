package com.sda.post.office;

public class PostOfficeApp {

    public static void main(String[] args) {

        PackageStatus sent = PackageStatus.SENT;
        PackageStatus travelling = PackageStatus.TRAVELLING;
        PackageStatus courier = PackageStatus.COURIER;
        PackageStatus delivered = PackageStatus.DELIVERED;
        PackageStatus lost = PackageStatus.LOST;
        PackageStatus returned = PackageStatus.RETURNED;

        System.out.println(sent.getMessage());
        Package newPackage = new Package(PackageStatus.SENT, "Elektronika");
        System.out.println(newPackage);

        System.out.println(delivered.getMessage());
        newPackage.setStatus(PackageStatus.DELIVERED);
        System.out.println(newPackage);

    }
}
