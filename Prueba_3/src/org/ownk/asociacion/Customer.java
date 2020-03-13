package org.ownk.asociacion;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private CreditCard creditCard;

    public Customer() {
        //Lo que sea que el construtor haga
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    // Más código aquí
}
