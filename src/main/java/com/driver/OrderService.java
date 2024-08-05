package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.saveOrder(order);
    }

    public void savePartner(String partnerId) {
        orderRepository.savePartner(partnerId);
    }

    public void saveOrderPartnerMap(String orderId, String partnerId) {
        orderRepository.saveOrderPartnerMap(orderId, partnerId);
    }

    public Order findOrderById(String orderId) {
        return orderRepository.findOrderById(orderId);
    }

    public DeliveryPartner findPartnerById(String partnerId) {
        return orderRepository.findPartnerById(partnerId);
    }

    public Integer findOrderCountByPartnerId(String partnerId) {
        return orderRepository.findOrderCountByPartnerId(partnerId);
    }

    public List<String> findOrdersByPartnerId(String partnerId) {
        return orderRepository.findOrdersByPartnerId(partnerId);
    }

    public List<String> findAllOrders() {
        return orderRepository.findAllOrders();
    }

    public void deletePartner(String partnerId) {
        orderRepository.deletePartner(partnerId);
    }

    public void deleteOrder(String orderId) {
        orderRepository.deleteOrder(orderId);
    }

    public Integer findCountOfUnassignedOrders() {
        return orderRepository.findCountOfUnassignedOrders();
    }

    public Integer findOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        return orderRepository.findOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
    }

    public String findLastDeliveryTimeByPartnerId(String partnerId) {
        return orderRepository.findLastDeliveryTimeByPartnerId(partnerId);
    }
}
