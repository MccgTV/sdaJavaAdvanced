package com.sda.basketball;

import java.util.Objects;

public class Player implements Comparable<Player> {

    private String firstName;
    private String lastname;
    private int height;

    public Player(String firstName, String lastname, int height) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return  getFirstName().equals(player.getFirstName())
                && getLastname().equals(player.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastname());
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Player otherPlayer) {
        if(this.getHeight() > otherPlayer.getHeight()) {
            return 1;
        } else if (this.getHeight() == otherPlayer.getHeight()) {
            return 0;
        } else {
            return -1;
        }
    }
}
