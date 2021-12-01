package com.mp;

import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class SimpleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select() {
        List<User> list =  userMapper.selectList(null);
        Assert.assertEquals(5, list.size());
        list.forEach(System.out::println);
    }
}
