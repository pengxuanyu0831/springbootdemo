package com.pengxy.demo.Dao;


import com.pengxy.demo.entity.Leader;
import jodd.introspector.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RedisMapper {
    public List<Leader> queryLeader();

}
