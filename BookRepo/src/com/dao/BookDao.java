package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.domain.Book;
import com.util.DBCon;

public class BookDao {
	private Connection conn;
	//��ѯ����ͼ����Ϣ
	public List findAllBooks() {
		conn = DBCon.getConnection();
		String listSQL = "select * from books";
		List list = new ArrayList();
		try {
			PreparedStatement psmt = conn.prepareStatement(listSQL);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getLong(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				book.setAuthor(rs.getString(4));
				book.setBookConcern(rs.getString(5));
				book.setCounts(rs.getInt(6));
				list.add(book);
			}
			conn.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	//����ͼ����Ϣ
	public boolean saveUser(Book book) throws Exception {
		conn = DBCon.getConnection();
		String listSQL = "insert into books  values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(listSQL);
		try {
			// For auto-increased identity field, pass "null".
			pstmt.setNull(1, java.sql.Types.INTEGER, "null");
			pstmt.setString(2, book.getName());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setString(4, book.getAuthor());
			pstmt.setString(5, book.getBookConcern());
			pstmt.setInt(6, book.getCounts());
			pstmt.executeUpdate();
			conn.commit();
			return true;
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return false;
	}
}
