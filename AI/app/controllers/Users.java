package controllers;

import play.mvc.Controller;
import play.mvc.With;

import models.User;

public class Users extends Controller {
	

	/**
	 * 跳转基本页面(未完善)
	 */
	public static void index() {
		signIn();
	}

	/**
	 * 登录(未完善)
	 */
	public static void signIn() {
		render();
	}

	/**
	 * 注册(未完善)
	 */
	public static void signUp() {
		render();
	}
}