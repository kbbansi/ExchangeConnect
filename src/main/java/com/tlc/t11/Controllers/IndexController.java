package com.tlc.t11.Controllers;

import com.tlc.t11.Models.IndexModel;
import com.tlc.t11.Services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")

public class IndexController {
    private final IndexService indexService;

    @Autowired
    public IndexController(IndexService indexService){
        this.indexService = indexService;
    }

    @GetMapping
    public IndexModel index() {
        return indexService.index();
    }
}
