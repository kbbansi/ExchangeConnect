package com.tlc.t11.Controllers;

import com.tlc.t11.ApiResponses;
import com.tlc.t11.ErrorHandlers.BadRequest;
import com.tlc.t11.Models.OrderModel;
import com.tlc.t11.Services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/exchange")

public class ExchangeController {
    @Autowired
    private final ExchangeService exchangeService;

    
   
    
    // private ApiResponses apiResponses; // custom class

    @Autowired
    public ExchangeController(ExchangeService exchangeService){
        this.exchangeService = exchangeService;
    }

    // @PostMapping("/mallon")
    // public void connectToExchange(OrderModel orderModel) {
    //     exchangeService.callMallon(orderModel);
    //     // restTemplate.postForObject("url/api_key/orderbook", requestType, orderModel.class);
    // }

    // @GetMapping
    // public List<OrderModel> getOrders() {
    //     return exchangeService.getOrders();
    // }

    // @ResponseStatus(HttpStatus.CREATED)
    // @PostMapping
    // @ResponseBody
    // public ApiResponses saveOrder(@RequestBody OrderModel orderModel){
    //     //sanitization checks
    //     System.out.println(orderModel.toString());
    //     exchangeService.saveOrder(orderModel);

    //     apiResponses = new ApiResponses("Order Created", 201);
    //     return apiResponses;
    // }
}
