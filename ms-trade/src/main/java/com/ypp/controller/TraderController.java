package com.ypp.controller;

import com.ypp.domain.dto.Response;
import com.ypp.service.TradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nannan on 2017/6/9.
 */
@RestController
@Slf4j
public class TraderController {

    @Autowired
    TradeService tradeService;

    @GetMapping(value = "/v1/trade")
    public Response trade() {
        return Response.success(tradeService.user());
    }
}
