package com.course.server.service;

import com.course.server.domain.Test;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZenGx1n
 * 2020/7/17 10:41
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {

        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        testExample.setOrderByClause("id asc");

        return testMapper.selectByExample(testExample);
    }

}
