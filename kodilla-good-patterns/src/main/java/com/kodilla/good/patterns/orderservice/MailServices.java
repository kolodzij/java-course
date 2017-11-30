package com.kodilla.good.patterns.orderservice;

public class MailServices implements InformationService {

    public void inform(User user) {
        System.out.println("Sending email with order confirmation to " + user.getEmail());
    }
}
