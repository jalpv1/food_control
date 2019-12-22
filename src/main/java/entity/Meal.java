package entity;

import java.io.Serializable;

public class Meal implements Serializable {
    int id;
    String name;
    String type;
    int amoundOfKkal;
    int amoundOfCarbonHydrates;
    int amoundOfProteins;
    private int amoundOfFats;

    public Meal(String name, String type, int amoundOfKkal, int amoundOfCarbonHydrates, int amoundOfProteins, int amoundOfFats) {
        this.name = name;
        this.type = type;
        this.amoundOfKkal = amoundOfKkal;
        this.amoundOfCarbonHydrates = amoundOfCarbonHydrates;
        this.amoundOfProteins = amoundOfProteins;
        this.amoundOfFats = amoundOfFats;
    }

    public int getAmoundOfFats() {
        return amoundOfFats;
    }

    public void setAmoundOfFats(int amoundOfFats) {
        this.amoundOfFats = amoundOfFats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmoundOfKkal() {
        return amoundOfKkal;
    }

    public void setAmoundOfKkal(int amoundOfKkal) {
        this.amoundOfKkal = amoundOfKkal;
    }

    public int getAmoundOfCarbonHydrates() {
        return amoundOfCarbonHydrates;
    }

    public void setAmoundOfCarbonHydrates(int amoundOfCarbonHydrates) {
        this.amoundOfCarbonHydrates = amoundOfCarbonHydrates;
    }

    public int getAmoundOfProteins() {
        return amoundOfProteins;
    }

    public void setAmoundOfProteins(int amoundOfProteins) {
        this.amoundOfProteins = amoundOfProteins;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", amoundOfKkal=" + amoundOfKkal +
                ", amoundOfCarbonHydrates=" + amoundOfCarbonHydrates +
                ", amoundOfProteins=" + amoundOfProteins +
                ", amoundOfFats=" + amoundOfFats +
                '}';
    }
}

