package com.oopsdev.mapper;

import com.oopsdev.domain.BoardVO;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void testGetList() {
        log.info("----------------");
        boardMapper.getList();
    }

    @Test
    public void testInsert() {
        BoardVO vo = new BoardVO();
        vo.setTitle("Test 테스트");
        vo.setContent("Content 테스트");
        vo.setWriter("tester");

        //boardMapper.insert(vo);
        boardMapper.insertSelectKey(vo);
    }
}
