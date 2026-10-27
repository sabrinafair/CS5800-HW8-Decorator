package org.HW8.models;

public class Customer {
    private String name;
    private LoyaltyStatus loyalty;

    public Customer(String name) {
        this.name = name;
        this.loyalty = new LoyaltyStatus();
    }

    public String getName() {
        return name;
    }

    public LoyaltyStatus getLoyalty() {
        return loyalty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoyalty(Statuses statuses) {
        this.loyalty.setStatus(statuses);
    }
}
