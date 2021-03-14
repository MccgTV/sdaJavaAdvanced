package com.sda.post.office;

public enum PackageStatus {

    SENT("Wysłano!"),
    TRAVELLING("W drodze!"),
    COURIER("W rękach kuriera!"),
    DELIVERED("Dostarczono!"),
    LOST("Paczka zagubiona"),
    RETURNED("Paczka zwrocona do nadawcy");

    private String message;

    PackageStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "message='" + message + '\'' +
                '}';
    }

    public static PackageStatus[] getErrorStatuses() {
        return new PackageStatus[]{LOST, RETURNED};
    }

    public boolean isError() {
        if (this == LOST || this == RETURNED) {
            return true;
        } else {
            return false;
        }
    }
    // return this == RETURNED || this == LOST;
}