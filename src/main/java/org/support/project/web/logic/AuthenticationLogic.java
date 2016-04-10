
package org.support.project.web.logic;

import javax.servlet.http.HttpServletRequest;

import org.support.project.web.bean.LoginedUser;
import org.support.project.web.exception.AuthenticateException;

/**
 * Authentication
 * @author Koda
 * @param <T> type
 */
//@DI(impl=org.support.project.transparent.base.logic.impl.DefaultAuthenticationLogicImpl.class)
public interface AuthenticationLogic<T extends LoginedUser> {
	/**
	 * 認証
	 * @param userId userId
	 * @param password password
	 * @return result
	 * @throws AuthenticateException AuthenticateException
	 */
	boolean auth(String userId, String password) throws AuthenticateException;
	/**
	 * ログインしているかどうか
	 * @param request request
	 * @return result
	 * @throws AuthenticateException AuthenticateException
	 */
	boolean isLogined(HttpServletRequest request) throws AuthenticateException;
	/**
	 * セッションにログインしたユーザ情報を設定
	 * @param userId userId
	 * @param request request
	 * @throws AuthenticateException AuthenticateException
	 */
	void setSession(String userId, HttpServletRequest request) throws AuthenticateException;
	/**
	 * セッションに保持したユーザ情報を取得
	 * @param request request
	 * @return session
	 * @throws AuthenticateException AuthenticateException
	 */
	T getSession(HttpServletRequest request) throws AuthenticateException;;
	/**
	 * 認可
	 * @param request request
	 * @return result
	 * @throws AuthenticateException AuthenticateException
	 */
	boolean isAuthorize(HttpServletRequest request) throws AuthenticateException;
	
	/**
	 * セッションを破棄(ログアウト処理)
	 * @param request request
	 * @throws AuthenticateException AuthenticateException
	 */
	void clearSession(HttpServletRequest request) throws AuthenticateException;
	
}
