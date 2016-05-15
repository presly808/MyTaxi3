package ua.artcode.taxi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User implements PassengerActive, DriverActive {

    private String id;
    private String phone;
    private String pass;
    private String name;
    private Address homeAddress;
    private Car car;
    private Collection<Long> orderIds = new ArrayList<>();

    public User(String phone, String pass, String name, Address homeAddress) {
        this.phone = phone;
        this.pass = pass;
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public User(String phone, String pass, String name, Car car) {
        this.phone = phone;
        this.pass = pass;
        this.name = name;
        this.car = car;
    }

    //for anonymous
    public User(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Address getHomeAddress() {
        return homeAddress;
    }

    @Override
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public Collection<Long> getOrderIds() {
        return orderIds;
    }

    @Override
    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void setCar(Car car) {
        this.car = car;
    }
}
