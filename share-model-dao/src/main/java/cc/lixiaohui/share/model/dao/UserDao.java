package cc.lixiaohui.share.model.dao;

import cc.lixiaohui.share.model.bean.User;

/**
 * 用户DAO
 * 除了listDeleted外其他list方法都不会select出deleted = 1的记录
 * 
 * @author lixiaohui
 * @date 2016年10月29日 下午6:28:42
 */
public interface UserDao extends BaseDao<User>{
	
	/**
	 * 根据username, password获取用户
	 * @param username
	 * @param password
	 * @return 若无对应user返回null, 否则返回对应用户
	 * @throws DaoException 
	 */
	User get(String username, String password) throws DaoException;
}
