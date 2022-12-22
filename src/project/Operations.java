package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 * <b>Operations</b> Class contains all the operation like Insert,delete,update
 * and display</br>
 * 
 * @author Prathamesh
 *
 */
public class Operations {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList<Vector> showAllEmps() {
		ArrayList<Vector> avc = new ArrayList<>();
		try {
			Connection c = CreateConnection.createc();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(Query.TABLEQ);
			while (rs.next()) {
				Vector poster = new Vector<>();
				poster.add(rs.getString(1));
				poster.add(rs.getString(2));
				poster.add(rs.getString(3));
				poster.add(rs.getString(4));
				poster.add(rs.getInt(5));
				poster.add(rs.getString(6));
				poster.add(rs.getInt(7));
				poster.add(rs.getString(8));
				avc.add(poster);
			}
			return avc;
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return avc;
	}

	public ArrayList<String> addPosting() {
		ArrayList<String> poster = new ArrayList<>();
		try {

			Connection c = CreateConnection.createc();
			Statement st = c.createStatement();
			ResultSet set = st.executeQuery(Query.POSTING);
			while (set.next()) {
				poster.add(set.getString(1));
			}
			return poster;
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return poster;
	}

	public boolean addEmployees(Employee em) {
		try {
			Connection c = CreateConnection.createc();
			PreparedStatement st = c.prepareStatement(Query.INSERTEM);
			st.setString(1, em.getFname());
			st.setString(2, em.getMname());
			st.setString(3, em.getLname());
			st.setInt(4, em.getAge());
			st.setInt(5, em.getSalary());
			st.setString(6, em.getAddress());
			st.setInt(7, em.getPostID());
			st.executeUpdate();
			return true;

		} catch (SQLException s) {
			s.printStackTrace();
			return false;
		}
	}

	public boolean deleteemp(String id) {
		try {
			Connection c = CreateConnection.createc();
			PreparedStatement st = c.prepareStatement(Query.DELETEEM);
			st.setString(1, id);
			st.executeUpdate();
			return true;
		} catch (SQLException s) {
			s.printStackTrace();
			return false;
		}
	}

	public boolean updateemp(Employee em) {
		try {
			Connection c = CreateConnection.createc();
			PreparedStatement st = c.prepareStatement(Query.UPDATEEM);
			st.setString(1, em.getFname());
			st.setString(2, em.getMname());
			st.setString(3, em.getLname());
			st.setInt(4, em.getAge());
			st.setInt(5, em.getSalary());
			st.setString(6, em.getAddress());
			st.setInt(7, em.getPostID());
			st.setString(8, em.getID());
			st.executeUpdate();
			return true;
		} catch (SQLException s) {
			s.printStackTrace();
			return false;
		}
	}
}
