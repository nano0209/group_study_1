package day11;

import java.lang.management.ThreadInfo;

public class CreditCard {
/*
Create a class call Credit Card with the following attributes:
Card Holder Name
Card Type
Expiration Date
Card Number
Card Code
 */

    String cardHolderName;
    String cardType;
    String expirationDate;
    String  cardNumber;
    int cardCode;

    /*
    Define 3 different Constructors
1->  no arguments
2-> Constructor initializing first 3 variables
3-> Constructor initializing all variables
Use Constructor chaining
     */

    public CreditCard() {
        this.cardHolderName = "Naima";
        this.cardType = "Visa";
        this.expirationDate = "02/2024";
        this.cardNumber = "3456765479";
        this.cardCode = 456;


    }

    public  CreditCard(String cardHolderName, String cardType, String expirationDate){
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
    }


    public CreditCard(String cardHolderName, String cardType, String expirationDate, String cardNumber, int cardCode) {
    this(cardHolderName, cardType, expirationDate);
    this.cardNumber = cardNumber;
    this.cardCode = cardCode;
    }

}
