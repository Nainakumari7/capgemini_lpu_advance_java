package com.prac;

import java.util.List;

public class EcommerceService {

    UserDAO userDAO = new UserDAO();
    OrderDAO orderDAO = new OrderDAO();
    PaymentDAO paymentDAO = new PaymentDAO();

    public void registerUser(User user, Profile profile) {
        user.setProfile(profile);
        userDAO.save(user);
    }

    public void addOrders(User user, List<PurchaseOrder> orders) {
        user.setOrders(orders);
        userDAO.save(user);
    }

    public void addPayment(PurchaseOrder order, double amount) {
        Payment p = new Payment();
        p.setPaidAmount(amount);
        p.setOrder(order);
        paymentDAO.save(p);
    }

    public void updateOrderAmount(PurchaseOrder order, double amount) {
        order.setAmount(amount);
        orderDAO.update(order);
    }

    public void deleteUser(User user) {
        userDAO.delete(user);
    }
}
