package com.kodilla.good.patterns.orderservice;

public class OrderProcessor {
        private InformationService informationService;
        private OrderService orderService;
        private OrderRepository orderRepository;

        public OrderProcessor(final InformationService informationService,
                              final OrderService orderService,
                              final OrderRepository orderRepository) {
            this.informationService = informationService;
            this.orderService = orderService;
            this.orderRepository = orderRepository;
        }

        public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrderMade = orderService.order(orderRequest.getUser(), orderRequest.getOrderId());
            if(isOrderMade) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(),orderRequest.getOrderId());
                return new OrderDto(orderRequest.getUser(),orderRequest.getOrderId());
            } else {
                return new OrderDto(orderRequest.getUser(),orderRequest.getOrderId());
            }
        }
    }
