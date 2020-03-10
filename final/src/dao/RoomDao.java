package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import model.RoomDataBean;
import oracle.net.aso.p;

public class RoomDao {

	private static RoomDao instance = new RoomDao();

	public static RoomDao getInstance() {
		return instance;
	}

	private RoomDao() {
	}

	private Connection getConnection() throws Exception {
		Connection conn = null;

		try {
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String dbId = "users";
			String dbPass = "1111";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void RoomInsert(RoomDataBean Bean) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int number = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select nvl(max(num)+1,1) from hobbyclass");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				number = rs.getInt(1);
			}

			pstmt = conn.prepareStatement("insert into hobbyclass values(?,?,?,?,?,?,?,?,?,?) ");
			pstmt.setInt(1, number);
			pstmt.setInt(2, Bean.getLike_ca());
			pstmt.setInt(3, Bean.getLike_sub());
			pstmt.setString(4, Bean.getMeet_title());
			pstmt.setString(5, Bean.getPhoto());
			pstmt.setString(6, Bean.getContent());
			pstmt.setString(7, Bean.getHost());
			pstmt.setTimestamp(8, Bean.getMeet_data());
			pstmt.setInt(9, Bean.getMembercnt());
			pstmt.setString(10, Bean.getLocation());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}

		}

	}
}
