package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Book;

/**
 * 图书Dao类
 * @author 1
 *
 */
public class BookDao {
	/**
	 * 图书添加
	 * @param con
	 * @param book
	 * @throws Exception
	 */
	public int add(Connection con,Book book)throws Exception {
		String sql= "insert into t_book values(null,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,book.getBookName());
		pstmt.setString(2,book.getAuthor());
		pstmt.setString(3,book.getSex());
		pstmt.setFloat(4,book.getPrice());
		pstmt.setInt(5, book.getBookTypeId());
		pstmt.setString(6, book.getBookDesc());
		return pstmt.executeUpdate();
	}
	
}
