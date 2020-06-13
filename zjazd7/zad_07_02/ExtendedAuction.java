/*Zuzanna Ciborowska
Exercise 07_02*/

package com.company;

public class ExtendedAuction extends BaseAuction implements Auction {
    public ExtendedAuction(String name, String description, double startingPrice, int auctionTime, int minTrustPoints, User seller) {
        super(name, description, startingPrice, auctionTime, minTrustPoints, seller);
    }

    @Override
    public void bid(User user, double price) {
        if(price > this.startingPrice && price > this.bidPrice) {
            this.buyer = user;
            this.bidPrice = price;
            this.auctionTime++;
        }
    }
}
