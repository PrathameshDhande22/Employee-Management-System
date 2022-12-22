package project;

/**
 * Contains all Query required to perform the mysql operation it is used in
 * Operations Class.
 * 
 * @author Prathamesh
 *
 */
public class Query {
	protected final static String POSTING = "select postname from postdetails order by postname;";
	protected final static String TABLEQ = "select e.id,e.fname,e.mname,e.lname,e.age,e.address,e.salary,p.postname from employeedetails e"
			+ " join postdetails p" + " on e.postid=p.id order by e.id;";
	protected final static String INSERTEM = "insert into employeedetails values (?,?,?,?,?,?,?,emid());";
	protected final static String DELETEEM = "delete from employeedetails where id=?;";
	protected final static String UPDATEEM = "update employeedetails set fname=?,mname=?,lname=?,age=?,salary=?,address=?,postid=? where id=?;";
}
