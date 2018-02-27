package com.epam.mongo.model;

public class AdvancedSimpleObject extends SimpleObject {

    private String cost;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "AdvancedSimpleObject{" +
                "id=" + super.getId() + ", " +
                "item=" + super.getItem() + ", " +
                "title=" + super.getTitle() +", " +
                "cost=" + cost + '}';
    }
}
