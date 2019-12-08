package com.kwikkart.kwikkart.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private String email;
    private String name;
    private String billingAddress;
    private String preference;
    private String phoneNumber;
    private List<Order> orderHistory;


    public User()
    {
        // Default constructor required for calls to DataSnapshot
    }

    public User(String email, String name, String billingAddress, String phoneNumber, String preference)
    {
        this.email = email;
        this.name = name;
        this.billingAddress = billingAddress;
        this.phoneNumber = phoneNumber;
        this.preference = preference;
        this.orderHistory = new ArrayList<>();
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public Map<String, Object> toMap(){
        Map<String, Object> userValues = new HashMap<>();
        userValues.put("email", this.email);
        userValues.put("name", this.name);
        userValues.put("billingAddress", this.billingAddress);
        userValues.put("phoneNumber", this.phoneNumber);
        userValues.put("preference", this.preference);
        userValues.put("orderHistory", null);

        return userValues;
    }


}
