package com.pengxy.demo.service;

import com.pengxy.demo.Dao.RedisMapper;
import com.pengxy.demo.entity.Leader;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/13 22:05
 */

@Service
public class RedisService {
/*    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;*/

    @Autowired
    private RedisMapper redisMapper;

    public List<Leader> queryLeader(){
        List<Leader> leaderList = redisMapper.queryLeader();
        return  leaderList;
    }
}
