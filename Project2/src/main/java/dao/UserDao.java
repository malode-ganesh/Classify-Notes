package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.Users;

public class UserDao {

	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}

	// Method to insert data for Student and Faculty
	public boolean SaveUsers(Users users) {
		boolean f = false;
		// users database
		String q = null;
		try {
			if (users.getUserType().equals("Student")) {
				System.out.println("True");
				q = "insert into users(fname,email,course,pwd) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, users.getName());
				pstmt.setString(2, users.getEmail());
				pstmt.setString(3, users.getCourse());
				pstmt.setString(4, users.getPwd());
				pstmt.executeUpdate();
				f = true;
			} else {
				q = "insert into classify_admin(fname,email,course) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, users.getName());
				pstmt.setString(2, users.getEmail());
				pstmt.setString(3, users.getCourse());

				pstmt.executeUpdate();
				f = true;
				System.out.println("false block");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return f;
	}

	//Verify student login
	public boolean Verify(Users users) {
		boolean f = false;
		try {
		PreparedStatement pstmt = con.prepareStatement("select * from users where email=? and pwd=?");
		pstmt.setString(1, users.getEmail());
		pstmt.setString(2, users.getPwd());		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()){
			f = true;
			users.setName(rs.getString("fname"));
			users.setCourse(rs.getString("course"));
		}
		}catch(Exception e) {
			System.out.print(e);
		}
		return f;
	}
	
	//Verify Admin Login
	public boolean VerifyAdmin(Users user) {
		boolean f = false;
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from classify_admin where email=? and pwd=?");
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPwd());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				f = true;
				user.setName(rs.getString("fname"));
				user.setCourse(rs.getString("course"));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return f;
	}
}
