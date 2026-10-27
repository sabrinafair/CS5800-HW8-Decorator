package org.HW8.models;

public class LoyaltyStatus {
//    Finally, create a class that represents the customer's loyalty status.
//    This class should have a method that applies a discount to the total order cost based on the customer's status.
        Statuses status;

    public void setStatus(Statuses status) {
        this.status = status;
    }

    public Statuses getStatus() {
        return status;
    }

    public double getTotalWithDiscount(double originalTotal){
        if(status == Statuses.SILVER) return originalTotal * .95;
        else if (status == Statuses.GOLD) return originalTotal * .9;
        else if (status == Statuses.PLATINUM) return originalTotal * .85;
        else return originalTotal;
    }
}
