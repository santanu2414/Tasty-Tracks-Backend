package com.santanu.service;

import com.santanu.model.OrderItem;
import com.santanu.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImplementation implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderIem(OrderItem orderItem) {

        OrderItem newOrderItem = new OrderItem();
//	    	newOrderItem.setMenuItem(orderItem.getMenuItem());
//	    	newOrderItem.setOrder(orderItem.getOrder());
        newOrderItem.setQuantity(orderItem.getQuantity());
        return orderItemRepository.save(newOrderItem);
    }


}

