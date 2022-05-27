package com.chainsys.minproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.minproject.pojo.Appointments;

public class AppointmentDao {
	private static Connection getconnection() {
		Connection con = null;
		String drivername="oracle.jdbc.OracleDriver";
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="oracle";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(dburl,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static java.sql.Date utiltoSqlConvert(java.util.Date date){
		return new java.sql.Date(date.getTime());
	}
	public static java.util.Date sqltoUtilconvert(java.sql.Date date){
		return new java.util.Date(date.getTime());
	}
	public static int insertAppointments(Appointments newapp) {
		String insertquery = "insert into Appointment(app_id,app_date,doctor_id,patient_name,fees_collected,fees_category) values(?,?,?,?,?,?)";
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement(insertquery);
			pstmt.setInt(1, newapp.getApp_id());
			pstmt.setDate(2, utiltoSqlConvert(newapp.getApp_date()));
			pstmt.setInt(3, newapp.getDoc_id());
			pstmt.setString(4, newapp.getPatient_name());
			pstmt.setFloat(5, newapp.getFees_collected());
			pstmt.setString(6,newapp.getFees_catagery() );
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	public static Appointments getAppointmentsById(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Appointments app=null;
		try {
			pstmt = mycon.prepareStatement("select app_id,app_date,DOCTOR_ID,patient_name,fees_collected,fees_category from Appointment where app_id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			app=new Appointments();
			if(rs.next()) {
				app.setApp_id(rs.getInt(1));
				app.setApp_date(sqltoUtilconvert(rs.getDate(2)));
				app.setDoc_id((rs.getInt(3)));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getFloat(5));
				app.setFees_catagery(rs.getString(6));
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return app;
	}
	public static List<Appointments> getAllAppointments() {
		List<Appointments>listOfAppointments =new ArrayList<Appointments>();
		Connection mycon = getconnection();
		Statement stmt = null;
		ResultSet rs = null;
		Appointments app;
		try {
			stmt = mycon.createStatement();
			rs = stmt.executeQuery("select app_id,app_date,doctor_id,patient_name,fees_collected,fees_category from Appointment");
			while(rs.next()) {
				app=new Appointments();
				app.setApp_id(rs.getInt(1));
				app.setApp_date(sqltoUtilconvert(rs.getDate(2)));
				app.setDoc_id((rs.getInt(3)));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getFloat(5));
				app.setFees_catagery(rs.getString(6));
				listOfAppointments.add(app);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				mycon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfAppointments;
	}
	public static int updateAppointments(Appointments newapp) {

		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("update Appointment set app_date=?,doctor_id=?,patient_name=?,fees_collected=?,fees_category=? where app_id=?");
			pstmt.setDate(1, utiltoSqlConvert(newapp.getApp_date()));
			pstmt.setInt(2, newapp.getDoc_id());
			pstmt.setString(3, newapp.getPatient_name());
			pstmt.setFloat(4, newapp.getFees_collected());
			pstmt.setString(5, newapp.getFees_catagery());
			pstmt.setInt(6, newapp.getApp_id());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int deleteAppointments(int id) {
		Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		int row = 0;
		try {
			pstmt = mycon.prepareStatement("delete appointment where app_id=?");
			pstmt.setInt(1, id);
			row = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	public static int updatePatientName(int id,String docname) {
        String updatequery = "update appointment set patient_name=? where app_id=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getconnection();
            ps = con.prepareStatement(updatequery);
            ps.setString(1, docname);
            ps.setInt(2, id);
            ps.executeUpdate();
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rows;
    }public static int updateCollectedFees(int id, float fees) {
        String updatequery = "update appointments set fees_collected=?,fees_ where app_id=?";
        Connection con = null;
        int rows = 0;
        PreparedStatement ps = null;
        try {
            con = getconnection();
            ps = con.prepareStatement(updatequery);
            ps.setDouble(1, fees );
            ps.setInt(2, id);
            ps.executeUpdate();
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rows;
    }

	public static String category(int doc_id, float collected_fees) {
    	
    	Connection mycon = getconnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String category=null;
		try {
			pstmt = mycon.prepareStatement("select Standard_fees from doctors where doc_id=?");
			pstmt.setInt(1, doc_id);
			rs=pstmt.executeQuery();
			if(rs.getInt(1)==collected_fees &&collected_fees>0)
				category="Standard fees";
			else if(rs.getInt(1)<collected_fees &&collected_fees>0)
				category="extra fees";
			else if(rs.getInt(1)>collected_fees &&collected_fees>0)
				category="low fees";
			else category="wrong input";
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			mycon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		return category;
    }
     

}


