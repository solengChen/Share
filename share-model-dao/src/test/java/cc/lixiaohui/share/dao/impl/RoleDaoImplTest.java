package cc.lixiaohui.share.dao.impl;

import java.util.List;

import org.junit.Test;

import cc.lixiaohui.share.model.bean.Role;
import cc.lixiaohui.share.model.dao.RoleDao;
import cc.lixiaohui.share.model.dao.util.DaoFactory;

/**
 * @author lixiaohui
 * @date 2016年10月30日 下午8:56:02
 */
public class RoleDaoImplTest {
	
	private DaoFactory factory = new DaoFactory();
	
	@Test
	public void testList() throws InstantiationException, IllegalAccessException {
		RoleDao dao = factory.getDao(RoleDao.class);
		List<Role> roles = dao.list();
		for (Role r : roles) {
			System.out.println(r.toString());
		}
	}
	
	@Test
	public void testDelete() throws InstantiationException, IllegalAccessException {
		RoleDao dao = factory.getDao(RoleDao.class);
		System.out.println(dao.delete(3));
	}
	
	@Test
	public void testAdd() throws InstantiationException, IllegalAccessException {
		RoleDao dao = factory.getDao(RoleDao.class);
		Role role = new Role();
		role.setId(3);
		role.setDescription("non");
		System.out.println(dao.add(role));
	}
	
	@Test
	public void testUpdate() throws InstantiationException, IllegalAccessException {
		RoleDao dao = factory.getDao(RoleDao.class);
		Role role = new Role();
		role.setId(3);
		role.setDescription("我我das");
		System.out.println(dao.update(role));
	}
	
}