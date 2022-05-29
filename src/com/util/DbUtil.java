package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库工具类
 *
 */
public class DbUtil {
	
	//数据库连接地址
	private String dbUrl = "jdbc:mysql://localhost:3306/db_book";
	private String dbUserName = "root"; //用户名
	private String dbPassword = "Fengxi1217.00"; //密码
	private String jdbcNmae = "com.mysql.cj.jdbc.Driver"; //驱动名称
	
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception{
		Class.forName(jdbcNmae);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
	 * 关闭数据库连接
	 * @param con
	 * @throws Exception
	 */
	public void close(Connection con)throws Exception{
		if(con != null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
	}
	
}
