package com.sda.post.office;
import java.util.UUID;

public class Package {

    PackageStatus status;
    String contents;
    String id;

    public Package(PackageStatus status, String contents) {
        this.status = status;
        this.contents = contents;
        this.id = UUID.randomUUID().toString();
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Package{" +
                "status=" + status +
                ", contents='" + contents + '\'' +
                ", ID='" + id + '\'' +
                '}';
    }
}
