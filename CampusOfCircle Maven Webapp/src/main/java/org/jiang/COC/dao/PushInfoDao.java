package org.jiang.COC.dao;

import java.util.List;

import org.jiang.COC.model.PushInfo;
import org.jiang.COC.model.User;

/**
 * 
 * @author cherry
 *
 */
public interface PushInfoDao {
	/***
	 * 用户发布动态
	 * @param user
	 */
	public void savePushInfo(PushInfo pushInfo);
	public List<PushInfo> findByuserIds(List<Long> list);
	public PushInfo getPushIfoBywbId(long wbId);
	public void deletePushInfo(PushInfo pushInfo);
}