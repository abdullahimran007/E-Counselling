package package1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dblogic 
{
Connection con=null;
Statement st=null;
ResultSet rs=null;
	public int regd(String coursename, int rollno, int rank, String name,
			String dateofbirth, String guardianname, 
			String gender, String category, String state, String qualification,
			String graduation, int gradpassingyr, int gradpercentage,
			String interboard, int interpassingyr, int interpercentage,
			String sscboard, int sscpassingyr, int sscpercentage,
			String username, String password, String securityque,
			String answer, String city, String dist, int pin, int contactno,
			String email) throws SQLException,ClassNotFoundException
	{
		try{
			int i=Dbconnect.getStatement().executeUpdate("insert into Login1 values(LOGIN_SEQ.nextval,'"+username+"','"+password+"','student','notregistered')"); 
		
		int j=Dbconnect.getStatement().executeUpdate("insert into STUDENT values(STUDENT1_SEQ.nextval,'"+coursename+"',"+rollno+","+rank+",'"+name+"','"
				+dateofbirth+"','"+guardianname+"','"+gender+"','"+category+"','"+state+"','"+qualification+"','"+graduation+"','"+gradpassingyr+"','"
				+gradpercentage+"','"+interboard+"','"+interpassingyr+"','"+interpercentage+"','"+sscboard+"','"+sscpassingyr+"','"+sscpercentage+"','"
				+securityque+"','"+answer+"','"+city+"','"+dist+"',"+pin+","+contactno+",'"+email+"',LOGIN_SEQ.nextval-1)");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		return 0;
	}
	public ResultSet retid()throws Exception
	{
		rs=Dbconnect.getStatement().executeQuery("select STDID from STUDENT order by STDID desc");
		return rs;
	}
	public ResultSet RetLogin(String username, String password, String type)throws Exception 
	{
		
		rs=Dbconnect.getStatement().executeQuery("select * from LOGIN1 where username='"+username+"' and password='"+password+"' and TYPE='"+type+"'");
		System.out.println("after db method"); 
		
		return rs;
	}
	
	public ResultSet RetStud()throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select * from STUDENT");
		return rs;
	}
	public ResultSet SelectStudent(String stdid)throws Exception {
		Long id=Long.parseLong(stdid);
		rs=Dbconnect.getStatement().executeQuery("select * from STUDENT where STDID="+id+"" );
		return rs;
	}
	public int ApprovedStud(Long id)throws Exception {
		int i=Dbconnect.getStatement().executeUpdate("update LOGIN1 set STATUS='Approved' where LOGINID="+id+"");
		return i;
	}
	public int RejectStud(Long id)throws Exception {
		int i=Dbconnect.getStatement().executeUpdate("delete from LOGIN1 where LOGINID="+id+"");
		return i;
	}
	public int RegisterMba(String clgname, String address, int yearofestablishment,
			String cemail, String web, String description, String university,
			String ctype, Long phno, Long collegecode, String branch,
			 String username,String password,int seats, String cname)throws SQLException,ClassNotFoundException {
		try{
			int i=Dbconnect.getStatement().executeUpdate("insert into LOGIN1 values(LOGIN_SEQ.nextval,'"+username+"','"+password+"','college','NotApproved')");
			int j=Dbconnect.getStatement().executeUpdate("insert into COLLEGE values(COLLEGE_SEQN.nextval,'"+clgname+"','"+address+"','"+yearofestablishment+"','"+cemail+"','"+web+"','"+description+"','"+university+"','"+ctype+"',"+phno+","+collegecode+",'"+branch+"',"+seats+",LOGIN_SEQ.nextval-1,'"+cname+"')");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
			return 0;
		
		}
	public ResultSet retcid() throws Exception{
		rs=Dbconnect.getStatement().executeQuery("select CID from COLLEGE order by CID desc");
		return rs;
	}
	public ResultSet RetCollg() throws Exception{
		
		rs=Dbconnect.getStatement().executeQuery("select * from COLLEGE");
		
		return rs;
	}
	
	public ResultSet SelectCollege(String cid)throws Exception {
		Long id=Long.parseLong(cid);
		rs=Dbconnect.getStatement().executeQuery("select * from COLLEGE where CID ="+id+"");
		return rs;
	}
	public int ApprovedCollg(int colid)throws Exception {
		int i=Dbconnect.getStatement().executeUpdate("update LOGIN1 set STATUS='Approved' where LOGINID="+colid+"");
		
		return i;
	
	}
	public int Rejectclg(int Colid)throws Exception {
		int i=Dbconnect.getStatement().executeUpdate("delete from LOGIN1 where LOGINID="+Colid+"");
		return i;
	}
	public ResultSet viewown(Long logid)throws Exception {
		
rs=Dbconnect.getStatement().executeQuery("select COURSENAME,s.ROLL,s.RANK,s.NAME,s.DOB,s.GUARDIAN,s.GENDER,s.CATEGORY,s.state,s.qualification,s.GRADUNI,s.gradpassingyr,s.gradpercentage,s.interboard,s.interpassingyr,s.interpercentage,s.sscboard,s.sscpassingyr,s.sscpercentage,l.username,l.password,s.SECURITY,s.answer,s.city,s.dist,s.pin,s.CONTACT,s.email from LOGIN1 l,STUDENT s where l.LOGINID=s.LOGINID and l.LOGINID="+logid+"");
 
		return rs;
	}
	public int InsertChoice(String name, int rank, String cid1,
			String cid2, String cid3, String branch) {
		try{
			int p=Dbconnect.getStatement().executeUpdate("insert into CHOICE values(CHOICE_SEQ.nextval,'"+name+"',"+rank+",'"+cid1+"','"+cid2+"','"+cid3+"','"+branch+"')");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return 0;
	}
	public ResultSet retchid()throws Exception {
		rs=Dbconnect.getStatement().executeQuery(" select CHID from CHOICE order by CHID desc ");
			return rs;
			}
	public ResultSet view(Long logid)throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select s.NAME,s.RANK from LOGIN1 l,STUDENT s where l.LOGINID=s.LOGINID and l.LOGINID="+logid+"");
		return rs;
	}
	public int updateacc(String coursename, int rollno, int rank, String name,
			String dateofbirth, String guardianname, String gender,
			String category,String state, String qualification, String graduation,
			int gradpassingyr, int gradpercentage, String interboard,
			int interpassingyr, int interpercentage, String sscboard,
			int sscpassingyr, int sscpercentage, String username,
			String password, String securityque, String answer, String city,
			String dist, int pin, int contactno, String email,Long logid) throws SQLException 
	{
	 int i=Dbconnect.getStatement().executeUpdate("update LOGIN1 set USERNAME='"+username+"',PASSWORD='"+password+"' where LOGINID="+logid+""); 
	 	int j=Dbconnect.getStatement().executeUpdate("update STUDENT set COURSENAME='"+coursename+"',ROLL="+rollno+",RANK="+rank+",NAME='"+name+"',DOB='"+dateofbirth+"',GUARDIAN='"+guardianname+"',GENDER='"+gender+"',CATEGORY='"+category+"',STATE='"+state+"',QUALIFICATION='"+qualification+"',GRADUNI='"+graduation+"',GRADPASSINGYR="+gradpassingyr+",GRADPERCENTAGE="+gradpercentage+",INTERBOARD='"+interboard+"',INTERPASSINGYR="+interpassingyr+",INTERPERCENTAGE="+interpercentage+",SSCBOARD='"+sscboard+"',SSCPASSINGYR="+sscpassingyr+",SSCPERCENTAGE="+sscpercentage+",SECURITY='"+securityque+"',ANSWER='"+answer+"',CITY='"+city+"',DIST='"+dist+"',PIN="+pin+",CONTACT="+contactno+",EMAIL='"+email+"' where LOGINID="+logid+"");
		return 0;
	}
	
	public int noticemgmt(String subject, String content, String date) throws SQLException{
		
		try{
			int i=Dbconnect.getStatement().executeUpdate("insert into NOTICE values(NOTICE_SEQ.nextval,'"+subject+"','"+content+"','"+date+"')");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public ResultSet noticesmg() throws SQLException {
	
			rs=Dbconnect.getStatement().executeQuery("select * from NOTICE");
			
			return rs;
		}
	public ResultSet viewnot(String nid)throws Exception {
		Long id=Long.parseLong(nid);
		rs=Dbconnect.getStatement().executeQuery("select * from NOTICE where NOTICEID ="+id+"");
		return rs;
	}
	public ResultSet feedback(Long logid) throws SQLException {
		rs=Dbconnect.getStatement().executeQuery("select s.STDID from STUDENT s,LOGIN1 l where s.LOGINID=l.LOGINID and l.LOGINID="+logid+"");
		return rs;
	}
	
	public int feedbackmgmt(String fsubject, String fcontent, String fdate,String temp) {
		try
		{
			int i=Dbconnect.getStatement().executeUpdate("insert into FEEDBACK values(FEEDBACK_SEQ.nextval,'"+temp+"','"+fsubject+"','"+fcontent+"','"+fdate+"')");
		
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}
		return 0;
	}
	
	

	
	public ResultSet cpassword(Long logid) throws SQLException {
		rs=Dbconnect.getStatement().executeQuery("select l.PASSWORD from LOGIN1 l ,STUDENT s where s.LOGINID=l.LOGINID and l.LOGINID="+logid+"");
		return rs;
		
	}
	public int changepass(String temp1, String chngp,Long logid) {
		try
		{
		int i=Dbconnect.getStatement().executeUpdate("update LOGIN1 set PASSWORD='"+chngp+"' where LOGINID="+logid+"");	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public ResultSet RetFeed()throws Exception {
		System.out.println("lll");

		rs=Dbconnect.getStatement().executeQuery("select * from FEEDBACK");
		System.out.println("lll");
		return rs;
	}
	public ResultSet VwFdBk(String fid)throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select s.NAME,f.SUBJECT,f.CONTENT from STUDENT s,FEEDBACK f where s.STDID=f.STDID and f.FEEDBACKID="+fid+" ");
		return rs;
	}
	public ResultSet slmba() throws SQLException {
		rs=Dbconnect.getStatement().executeQuery("select * from COLLEGE where CNAME='mba'");
		return rs;
	}
	
	public ResultSet slmca() throws SQLException {
		rs=Dbconnect.getStatement().executeQuery("select * from COLLEGE where CNAME='mca'");
		return rs;
	}
	public ResultSet slbtech() throws SQLException {
		rs=Dbconnect.getStatement().executeQuery("select * from COLLEGE where CNAME='btech'");
		return rs;
	}
	
	
	public ResultSet CounselDet(Long id)throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select STDID,NAME,DOB,RANK,GUARDIAN,CATEGORY  from STUDENT where STDID="+id+"");
		return rs;
	}
	public ResultSet RetChoice()throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select * from CHOICE");
		return rs;
	}
	public ResultSet CoDet(int id1) throws Exception{
		rs=Dbconnect.getStatement().executeQuery("select CH1,BRANCH from CHOICE where RANK="+id1+"");
		return rs;
	}
	public int Allotment(String stdid, String name, String dateofbirth,
			int rank, String guardianname, String category, String altinst,
			String altbrnch) throws SQLException {
		int i=Dbconnect.getStatement().executeUpdate("insert into ALLOTMENT values('"+stdid+"','"+name+"','"+dateofbirth+"',"+rank+",'"+guardianname+"','"+category+"','"+altinst+"','"+altbrnch+"')");
		return 0;
	}
	public ResultSet RetRank(int rkno) throws Exception{
		rs=Dbconnect.getStatement().executeQuery("select * from ALLOTMENT where RANK="+rkno+"");
		return rs;
	}
	public ResultSet RetRank1(Long logid)throws Exception {
		rs=Dbconnect.getStatement().executeQuery("select a.STDID,a.NAME,a.DOB,a.RANK,a.GUARDIAN,a.CATEGORY,a.ALLOTEDINSTITUTION,a.ALOTEDBRANCH,s.COURSENAME  from ALLOTMENT a,STUDENT s,LOGIN1 l where l.LOGINID=s.LOGINID and s.STDID=a.STDID and s.LOGINID="+logid+"");
		return rs;
	}
	public ResultSet ViewCollDet(Long logid) throws Exception{
		rs=Dbconnect.getStatement().executeQuery("select USERNAME,PASSWORD,CLGNAME,UNIVERSITY,SEATS,YEAROFESTD,CEMAIL,WEB,CTYPE,PHNO,COLLEGECODE,BRANCH,ADDRESS,DESCRIPTION,CNAME from LOGIN1 l,COLLEGE c where l.LOGINID=c.LOGINID and l.LOGINID="+logid+"");
		return rs;
	}
	public int UpdColl(String username, String password, String clgname,
			String university, int seats, int yearofestablishment, String cemail, String web,
			Long phno,  Long collegecode,String address, String description, String coursename,
			Long logid)throws Exception {
		int i=Dbconnect.getStatement().executeUpdate("update LOGIN1 set USERNAME='"+username+"',PASSWORD='"+password+"' where LOGINID="+logid+"");
		int j=Dbconnect.getStatement().executeUpdate("update COLLEGE set CLGNAME='"+clgname+"',UNIVERSITY='"+university+"',SEATS="+seats+",YEAROFESTD="+yearofestablishment+",CEMAIL='"+cemail+"',WEB='"+web+"',PHNO="+phno+",COLLEGECODE="+collegecode+",ADDRESS='"+address+"',DESCRIPTION='"+description+"',CNAME='"+coursename+"' where LOGINID="+logid+"");
				return 0;
	}
	}
		
	
	
	
		
	
	
	
	
	
	

