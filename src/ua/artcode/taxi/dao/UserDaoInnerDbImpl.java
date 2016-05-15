package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDaoInnerDbImpl implements UserDao {

    private AppDB appDB;

    public UserDaoInnerDbImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public User createUser(User user, String identifier) {
        return appDB.addUser(user, identifier);
    }

    @Override
    public Collection<User> getAllUsers() {
        return appDB.getUsers().keySet();
    }

    @Override
    public User updateUser(User newUser) {

        User result = null;

        for (User user : appDB.getUsers().keySet()) {

            if (user.getId().equals(newUser.getId())) {

                user = newUser;
/*
                user.setPhone(newUser.getPhone());
                user.setPass(newUser.getPass());
                user.setName(newUser.getName());
                user.setHomeAddress(newUser.getHomeAddress());
                user.setCar(newUser.getCar());
*/
                result = user;
            }
        }
        return result;
    }

    @Override
    public User deleteUser(String id) {

        User result = null;

        for (User user : appDB.getUsers().keySet()) {
            if (user.getId().equals(id)) {
                result = user;
            }
        }
        appDB.getUsers().remove(result);

        return result;
    }

    @Override
    public User find(String phone) {
        return appDB.findUser(phone);
    }

    @Override
    public List<User> getAllPassenger() {

        List<User> passengers = new ArrayList<>();

        for (User user : appDB.getUsers().keySet()) {
            if (user.getId().subSequence(0, 1).equals("P")) {
                passengers.add(user);
            }
        }
        return passengers;
    }

    @Override
    public List<User> getAllDrivers() {

        List<User> drivers = new ArrayList<>();

        for (User user : appDB.getUsers().keySet()) {
            if (user.getId().subSequence(0, 1).equals("D")) {
                drivers.add(user);
            }
        }
        return drivers;
    }

    @Override
    public List<Order> getOrdersOfUser(User user) {
        return appDB.getUsers().get(user);
    }
}
