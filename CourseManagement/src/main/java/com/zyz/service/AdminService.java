package com.zyz.service;

import java.util.List;
import java.util.Map;

import com.zyz.entity.Admin;

public interface AdminService {

	List<Admin> queryData(Map<String, Integer> pageMap);
    Integer queryCount();
    Integer insertAdmin(Admin admin);
    String checkAdminByKey(String username);
    Admin queryAdminByKey(String username);
    Integer updateAdmin(Admin admin);
    Integer batchDelAdmin(List<String> usernames);
    List<Admin> queryAdminBySome(Integer page, Integer limit, Integer id, String username);
    Integer queryCountBySome(Integer id, String username);
}
