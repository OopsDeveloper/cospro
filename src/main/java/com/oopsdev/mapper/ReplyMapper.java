package com.oopsdev.mapper;

import com.oopsdev.domain.Criteria;
import com.oopsdev.domain.ReplyVO;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ReplyMapper {

	public int insert(ReplyVO vo);

	public ReplyVO read(Long bno);

	public int delete(Long bno);

	public int update(ReplyVO reply);

	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno);

	public int getCountByBno(Long bno);
}
