package com.tlc.t11.Services;

import com.tlc.t11.Models.IndexModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
// @Service -- for semantics
public class IndexService {
    public IndexModel index() {
        System.out.println("Hit index"); // write to logs here
        return new IndexModel(
                true,
                "Exchange Connectivity",
                LocalDate.now()
        );
    }
}
