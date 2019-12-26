package ltd.zchd.house.biz.service;

import ltd.zchd.house.common.model.User;
import ltd.zchd.house.biz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    // 返回用户列表
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
