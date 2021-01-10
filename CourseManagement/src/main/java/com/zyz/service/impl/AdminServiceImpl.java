package com.zyz.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zyz.entity.Admin;
import com.zyz.mapper.AdminMapper;
import com.zyz.service.AdminService;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	private Logger logger=Logger.getLogger(AdminServiceImpl.class.getName());

	@Override
	public List<Admin> queryData(Map<String,Integer> pageMap){
		return adminMapper.queryData(pageMap);
	}
	
	@Override
	public Integer queryCount() {
		return adminMapper.queryCount();
	}
	
	@Override
	public Integer insertAdmin(Admin admin) {
		return adminMapper.insertAdmin(admin);
	}
	
	@Override
	public String checkAdminByKey(String username) {
		return adminMapper.checkAdminByKey(username);
	}
	
	@Override
	public Admin queryAdminByKey(String username) {
		return adminMapper.queryAdminByKey(username);
	}
	
	@Override
	public Integer updateAdmin(Admin admin) {
		logger.debug("service==admin:"+admin);
		Admin adm=adminMapper.queryAdminByKey(admin.getUsername());
		logger.debug("service==>adm"+adm);
		adm.setUsername(admin.getUsername());
		adm.setPassword(admin.getPassword());
		return adminMapper.updateAdmin(adm);
	}
	
	@Override
	public Integer batchDelAdmin(List<String> usernames) {
		return adminMapper.batchDelAdmin(usernames);
	}
	
	@Override
	public List<Admin> queryAdminBySome(Integer page,Integer limit,Integer id,String username){
		return adminMapper.queryAdminBySome(page, limit, id, username);
	}
	
	@Override
	public Integer queryCountBySome(Integer id,String username) {
		return adminMapper.queryCountBySome(id, username);
	}
}

