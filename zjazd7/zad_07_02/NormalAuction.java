/*Zuzanna Ciborowska
Exercise 07_02*/

package com.company;

public class BaseAuction implements Auction {
    public String name;
    public String description;
    public double startingPrice;
    public int auctionTime;
    public int minTrustPoints;
    public boolean isActive;
    public User buyer;
    public User seller;
    public double bidPrice;
    
    public BaseAuction(String name, String description, double startingPrice, int auctionTime, User seller, int minTrustPoints) {
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.auctionTime = auctionTime;
        this.minTrustPoints = minTrustPoints;
        this.isActive = true;
        this.seller = seller;
        this.bidPrice = 0.0;
    }

    @Override
    public void bid(User user, double price) {

    }

    public String getSellerLogin(){
        return this.seller.getLogin();
    }

    public int getAuctionTime(){
        return this.auctionTime;
    }

    public void setInactive(){
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }
}
