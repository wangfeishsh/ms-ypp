package com.ypp.external;

import com.ypp.domain.dto.Response;
import com.ypp.domain.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nannan on 2017/6/9.
 */
@FeignClient(name = "ms-user",url = "http://localhost:9003")
public interface UserClient {

    @RequestMapping(value = "/v1/user", method = RequestMethod.GET)
    Response<User> user(User user);
}
