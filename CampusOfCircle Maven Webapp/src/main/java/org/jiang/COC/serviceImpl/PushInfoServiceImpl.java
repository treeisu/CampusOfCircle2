package org.jiang.COC.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.jiang.COC.daoImpl.PushInfoDaoImpl;
import org.jiang.COC.daoImpl.UserDaoImpl;
import org.jiang.COC.model.PushInfo;
import org.jiang.COC.model.User;
import org.jiang.COC.service.PushInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * 
 * @author cherry
 *
 */
@Service
public class PushInfoServiceImpl implements PushInfoService {
	@Autowired
	private PushInfoDaoImpl pushInfoDaoImpl;
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Override
	@Transactional
	public void savePushInfo(PushInfo pushInfo) {
		// TODO Auto-generated method stub
		pushInfoDaoImpl.savePushInfo(pushInfo);
		
	}

	@Override
	@Transactional
	public List<PushInfo> findByuserIds(List<Long> userIds) {
		// TODO Auto-generated method stub
		List<PushInfo> list=new ArrayList<PushInfo>();
		list=pushInfoDaoImpl.findByuserIds(userIds);
		for( PushInfo blog:list){
			User user=userDaoImpl.getUserById(blog.getUserId());
			blog.setUser(user);
		}
		return list;
	}

	@Override
	@Transactional
	public void deleteBywbId(long wbId) {
		// TODO Auto-generated method stub
		PushInfo pushInfo=pushInfoDaoImpl.getPushIfoBywbId(wbId);
		pushInfoDaoImpl.deletePushInfo(pushInfo);
	}

	@Override
	@Transactional
	public PushInfo getPushIfoBywbId(long wbId) {
		// TODO Auto-generated method stub
		pushInfoDaoImpl.getPushIfoBywbId(wbId);
		return pushInfoDaoImpl.getPushIfoBywbId(wbId);
	}

	

}
