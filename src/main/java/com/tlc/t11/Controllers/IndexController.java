package com.tlc.t11.Controllers;

import com.tlc.t11.Models.IndexModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/")

public class IndexController {
    @GetMapping
    public Object index() {
        return new IndexModel(
                true,
                "Exchange Connectivity",
                LocalDate.now()
        );
    }
}
