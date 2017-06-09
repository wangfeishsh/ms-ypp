package com.ypp.service;

import com.alibaba.fastjson.JSON;
import com.ypp.domain.dto.Response;
import com.ypp.domain.dto.User;
import com.ypp.external.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nannan on 2017/6/9.
 */
@Service
@Slf4j
public class TradeService {

    @Autowired
    UserClient userClient;

    public User user() {
        log.info("user start");
        Map map = new HashMap();
        map.put("id","test");
        Response<User> response = userClient.user(map);
        log.info("user end : {}", JSON.toJSONString(response));
        if (response.isSuccess()) {
            return response.getData();
        } else {
            return null;
        }
    }
}
