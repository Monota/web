package org.support.project.web.dao;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;

import org.support.project.web.dao.gen.GenUserConfigsDao;

/**
 * ユーザ設定
 */
@DI(instance=Instance.Singleton)
public class UserConfigsDao extends GenUserConfigsDao {

	/** SerialVersion */
	private static final long serialVersionUID = 1L;
	/**
	 * インスタンス取得
	 * AOPに対応
	 * @return インスタンス
	 */
	public static UserConfigsDao get() {
		return Container.getComp(UserConfigsDao.class);
	}



}
