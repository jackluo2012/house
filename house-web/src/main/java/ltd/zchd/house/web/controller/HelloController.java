package ltd.zchd.house.web.controller;

import ltd.zchd.house.biz.service.UserService;
import ltd.zchd.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hello(ModelMap modelMap) {
        List<User> users = userService.getUsers();
        modelMap.put("user", users.get(0));
        return "hello";
    }

    @RequestMapping("index")
    public String index(){
        return "homepage/index";
    }
}
