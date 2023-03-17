package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entities.DbData;

public class DbDao {
	private Connection con;
	
	public DbDao(Connection con) {
		this.con = con;
	}
	
	public boolean getFileFY(DbData db) {
		boolean f= false;
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from db where course=? and year=?");
			pstmt.setString(1, db.getCourse());
			pstmt.setString(2, db.getYear());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				f = true;
				db.setFileName(rs.getString("fileName"));
				db.setPdf(rs.getBlob("pdf"));
				db.setSem(rs.getInt("sem"));
				db.setYear(rs.getString("year"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}
}
