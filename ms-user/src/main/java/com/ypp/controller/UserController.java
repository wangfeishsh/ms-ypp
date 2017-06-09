package com.ypp.controller;

import com.alibaba.fastjson.JSON;
import com.ypp.domain.db.User;
import com.ypp.domain.dto.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nannan on 2017/6/9.
 */
@RestController
@Slf4j
public class UserController {



    /**
     * @api {get} /v1/user 1、获取用户信息
     * @apiName user
     * @apiGroup User
     * @apiParam {String} id 用户ID.
     * @apiParam {String="111","123"} [name] 用户姓名.
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "id": "1",
     *       "name": "1"
     *     }
     *
     * @apiSuccess {int} code code.
     * @apiSuccess {String} message  message.
     * @apiSuccess {Object} data data.
     * @apiSuccess {String} data.id 用户ID.
     * @apiSuccess {String} data.name 用户姓名.
     * @apiSuccessExample {json} Success-Response:
     * {
     * "code": 200,
     * "message": "成功",
     * "data": {
     * "id":"111",
     * "name":"111"
     * }
     * }
     **/
    @GetMapping(value = "/v1/user")
    public Response<User> user(User user) {
        log.info("user start : {}", JSON.toJSONString(user));
        User d = User.builder().id("111").name("111").build();
        log.info("user end : {}", JSON.toJSONString(d));
        return Response.success(d);
    }
}
