package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
	
	@Select("select name from member where id='id'")
	public String getOneMember();
}
