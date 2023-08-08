package day11;

public class Transaction extends CreditCard {
    /*
    Define a class call Transaction with the following attributes:
Transaction status
AuthCode
Amount
Merchant Name
isInternational (boolean)

Class Transaction extends Credit card class
     */

  String transactionStatus;
  String authCode;
  double amount;
  String merchantName;
  boolean isInternational;

  /*
  Define 2 Constructors
1->  no arguments
2-> Constructor initializing all variables
Use constructor chaining (super)
   */

    public Transaction(){

    }

    public Transaction(String transactionStatus, String authCode, double amount, String merchantName, boolean isInternational, String cardHolderName, String cardType, String expiration, String cardNumber, int cardCode ) {
        super(cardHolderName, cardType, expiration, cardNumber, cardCode);
        this.transactionStatus = transactionStatus;
        this.authCode = authCode;
        this.amount = amount;
        this.merchantName = merchantName;
        this.isInternational = isInternational;

    }

    }

