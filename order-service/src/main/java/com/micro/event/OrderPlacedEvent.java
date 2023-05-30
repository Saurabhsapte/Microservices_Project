package com.micro.event;

import lombok.*;
import org.springframework.context.ApplicationEvent;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderPlacedEvent {
    private String orderNumber;

//    public OrderPlacedEvent(Object source, String orderNumber) {
//        super(source);
//        this.orderNumber = orderNumber;
//    }
//
//    public OrderPlacedEvent(String orderNumber) {
//        super(orderNumber);
//        this.orderNumber = orderNumber;
//    }
}