/*Zuzanna Ciborowska
Exercise 07_02*/

package com.company;

public interface Auction {
    String name = null;
    void bid(User user, double price);

    String getSellerLogin();
    int getAuctionTime();
    void setInactive();
    boolean isActive();
}
