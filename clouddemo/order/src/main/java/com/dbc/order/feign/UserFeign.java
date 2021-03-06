package com.dbc.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user")
@RequestMapping("user")
@Component
public interface UserFeign {

    @GetMapping("get/{id}")
    String findUserById(@PathVariable("id") Integer id);
}
