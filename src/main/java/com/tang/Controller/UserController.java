package com.tang.Controller;

import com.tang.Mapper.UserMapper;
import com.tang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUserList()
    {
        System.out.println("query");
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/user")
    @ResponseBody
    public String testUser()
    {
        return "user";
    }

}
