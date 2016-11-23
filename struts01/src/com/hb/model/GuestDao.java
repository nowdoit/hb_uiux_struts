package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public GuestDao() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver"); //ClassNotFoundException
		conn = DriverManager.getConnection(url, user, password); //SQLException
	}
	public List selectAll() throws SQLException {
		List list = new ArrayList<GuestVo>();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM guest");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new GuestVo(
						rs.getInt("SABUN"),
						rs.getString("NAME"),
						rs.getDate("NALJA"),
						rs.getInt("PAY")
						)
				);
			}
		} finally {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}
		return list;
	}
	
	public int insertOne(int sabun, String name, int pay) throws SQLException {
		int result = 0;
		try {
			pstmt = conn.prepareStatement("INSERT INTO guest VALUES (?, ?, SYSDATE, ?)");
			pstmt.setInt(1, sabun);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay);
			result = pstmt.executeUpdate();
		} finally {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}
		return result;
	}
}
