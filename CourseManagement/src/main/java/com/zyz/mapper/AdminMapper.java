package com.zyz.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zyz.entity.Admin;

public interface AdminMapper {

	List<Admin> queryData(Map<String, Integer> pageMap);
	Integer queryCount();
	Integer insertAdmin(Admin admin);
    String checkAdminByKey(String username);
    Integer batchDelAdmin(List<String> usernames);
    Admin queryAdminByKey(String username);
    Integer updateAdmin(Admin admin);
    List<Admin> queryAdminBySome(@Param("page") Integer page, @Param("limit") Integer limit, @Param("id") Integer id, @Param("username") String username);
    Integer queryCountBySome(@Param("id") Integer id, @Param("username") String username);
}

