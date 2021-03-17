package com.tlc.t11.Services;

import com.tlc.t11.DataAccess.OrderRepository;
import com.tlc.t11.ErrorHandlers.NotFound;
import com.tlc.t11.Models.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
//@Service
public class ExchangeService {
    private final OrderRepository orderRepository;

    @Autowired
    public ExchangeService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    // api call
    public void callMallon(OrderModel orderModel) {
        System.out.println(orderModel); // write to logs here
    }

    //get method -- retrieve data from database
    public List<OrderModel> getOrders() throws NotFound {
        return orderRepository.findAll();
        // can implement exceptions for nulls or empty result sets
    }

    // get method -- retrieve one order from database
    public Optional<OrderModel> getOne(Long id) {
        OrderModel orderModel = new OrderModel();
        orderModel.setId(id);
        return orderRepository.getOneOrder(orderModel.getId());
    }

    // save an order
    public void saveOrder(OrderModel orderModel) {
        System.out.println(orderModel); // write to logs here

        // we're making the assumption that the order is clean
        orderRepository.save(orderModel);
    }

}
