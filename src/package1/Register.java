package package1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class Register extends ActionSupport
{
private String coursename;
private int rollno;
private int rank;
private String name;
private String dateofbirth;
private String guardianname;
private String type;
private String gender;
private String category;
private String state;
private String qualification;
private String graduation;
private int gradpassingyr;
private int gradpercentage;
private String interboard;
private int interpassingyr;
private int interpercentage;
private String sscboard;
private int sscpassingyr;
private int sscpercentage;
private String username;
private String password;
private String securityque;
private String answer;
private String city;
private String dist;
private int pin;
private int contactno;
private String email;
private String msg;
private String stdid;
private Map<Integer,String> mapForSelect;
private Map<Integer,String> mapForSelect2;
Map session;
private String clgname;
private String address;
private int yearofestablishment;
private String cemail;
private String web; 
private String description;
private String university; 
private String ctype;
private Long phno;
private Long fax;
private Long collegecode;
private String branch;
private int seats; 
private String cname;
private String cid;
private int colid;

public int getColid() {
	return colid;
}
public void setColid(int colid) {
	this.colid = colid;
}
public Map<Integer, String> getMapForSelect() {
	return mapForSelect;
}
public void setMapForSelect(Map<Integer, String> mapForSelect) {
	this.mapForSelect = mapForSelect;
}
public Map getSession() {
	return session;
}
public void setSession(Map session) {
	this.session = session;
}

public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public String getName() {
	return name;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public void setName(String name) {
	this.name = name;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getGuardianname() {
	return guardianname;
}
public void setGuardianname(String guardianname) {
	this.guardianname = guardianname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public int getGradpassingyr() {
	return gradpassingyr;
}
public void setGradpassingyr(int gradpassingyr) {
	this.gradpassingyr = gradpassingyr;
}
public int getGradpercentage() {
	return gradpercentage;
}
public void setGradpercentage(int gradpercentage) {
	this.gradpercentage = gradpercentage;
}
public String getInterboard() {
	return interboard;
}
public void setInterboard(String interboard) {
	this.interboard = interboard;
}
public int getInterpassingyr() {
	return interpassingyr;
}
public void setInterpassingyr(int interpassingyr) {
	this.interpassingyr = interpassingyr;
}
public int getInterpercentage() {
	return interpercentage;
}
public void setInterpercentage(int interpercentage) {
	this.interpercentage = interpercentage;
}
public String getSscboard() {
	return sscboard;
}
public void setSscboard(String sscboard) {
	this.sscboard = sscboard;
}
public int getSscpassingyr() {
	return sscpassingyr;
}
public void setSscpassingyr(int sscpassingyr) {
	this.sscpassingyr = sscpassingyr;
}
public int getSscpercentage() {
	return sscpercentage;
}
public void setSscpercentage(int sscpercentage) {
	this.sscpercentage = sscpercentage;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSecurityque() {
	return securityque;
}
public void setSecurityque(String securityque) {
	this.securityque = securityque;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDist() {
	return dist;
}
public void setDist(String dist) {
	this.dist = dist;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public int getContactno() {
	return contactno;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getStdid() {
	return stdid;
}
public void setStdid(String stdid) {
	this.stdid = stdid;
}



public int getYearofestablishment() {
	return yearofestablishment;
}
public void setYearofestablishment(int yearofestablishment) {
	this.yearofestablishment = yearofestablishment;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}


public String getClgname() {
	return clgname;
}
public void setClgname(String clgname) {
	this.clgname = clgname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getWeb() {
	return web;
}
public void setWeb(String web) {
	this.web = web;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getUniversity() {
	return university;
}
public void setUniversity(String university) {
	this.university = university;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public Long getFax() {
	return fax;
}
public void setFax(Long fax) {
	this.fax = fax;
}
public Long getCollegecode() {
	return collegecode;
}
public void setCollegecode(Long collegecode) {
	this.collegecode = collegecode;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}


public Map<Integer, String> getMapForSelect2() {
	return mapForSelect2;
}
public void setMapForSelect2(Map<Integer, String> mapForSelect2) {
	this.mapForSelect2 = mapForSelect2;
}


Dblogic dl=new Dblogic();
public String StudentRegister()throws Exception
{
	int i=0;
	i=dl.regd(getCoursename(),getRollno(),getRank(),getName(),getDateofbirth(),getGuardianname(),
			getGender(),getCategory(),getState(),getQualification(),getGraduation(),getGradpassingyr(),
			getGradpercentage(),getInterboard(),getInterpassingyr(),getInterpercentage(),getSscboard(),
			getSscpassingyr(),getSscpercentage(),getUsername(),getPassword(),getSecurityque(),getAnswer(),getCity(),
			getDist(),getPin(),getContactno(),getEmail());
	ResultSet rs= dl.retid();
	if(rs.next())
	{
		setStdid(rs.getString(1));
	}
	
	return "registersuccess";
	
}
public String LoginData() throws Exception 
{
	
	ResultSet rs = dl.RetLogin(username, password,type);
	
	if (rs.next()) 
	{
		
		String status = rs.getString(5);
		String type = rs.getString(4);
		if (type.equals("admin"))
		{
			return "admin";
		}
		if (status.equals("Approved"))
		{
			if(type.equals("student"))
			{
			Map session = ActionContext.getContext().getSession();
			session.put("LOGINID", rs.getString(1));
			
			return "student";
			}
		}																				
		if (status.equals("Approved") && (type.equals("college")) )
		{
			
			Map session1 = ActionContext.getContext().getSession();
			session1.put("LOGINID", rs.getString(1));
			
			return "college";
		}
		else 
		{
			setMsg("Waiting For Approval");
			return "loginfail";
		}
	}
	return "loginfail";

}
public String studentMgt() throws Exception{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetStud();
	while(rs.next())
		mapForSelect.put(rs.getInt(1),rs.getString(5));
	return "displaystud";
}
public String SelectStd()throws Exception{
	
	ResultSet rs=dl.SelectStudent(getStdid());
	Register r= new Register();
	if(rs.next()){
		setStdid(rs.getString(28));
		setName(rs.getString(5));
		setRank(rs.getInt(4));
		setQualification(rs.getString(11));
		setCoursename(rs.getString(2));
	}
	return "displaystud";
}
public String Approved()throws Exception
{
	Long stdid=Long.parseLong(getStdid());
	int i=dl.ApprovedStud(stdid);
	setMsg("Successfully Approved");
	return "success";
}
public String RejStud()throws Exception{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetStud();
	while(rs.next())
		mapForSelect.put(rs.getInt(1),rs.getString(5));
	return "reject1";
}
public String Reject()throws Exception
{
	Long stdid=Long.parseLong(getStdid());
	System.out.println(stdid);
	int i=dl.RejectStud(stdid);
	setMsg("Successfully rejected");
	return "success1";
}
public String CollgData()throws Exception
{
	int i=0;
	i=dl.RegisterMba(getClgname(),getAddress(),getYearofestablishment(),getCemail(),getWeb(),getDescription(),getUniversity(),getCtype(),getPhno(),
			         getCollegecode(),getBranch(),getUsername(),getPassword(),getSeats(),getCoursename());
	ResultSet rs=dl.retcid();
	if(rs.next())
	{
		setCid(rs.getString(1));
	}
	
	return "clgregsucc";	
}
public String CollegeMgt() throws Exception{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetCollg();
	while(rs.next())
	mapForSelect.put(rs.getInt(1),rs.getString(2));
	
	return "dispcoll";
}
public String SelectCollg()throws Exception{
	ResultSet rs=dl.SelectCollege(getCid());
	if(rs.next())
	{   System.out.println(rs.getString(14));
	     setColid(rs.getInt(14));
		setClgname(rs.getString(2));
		setCollegecode(rs.getLong(11));
		setUniversity(rs.getString(8));
		setYearofestablishment(rs.getInt(4));
	}
	return "displayclg";
}
public String ApproveColg()throws Exception
{
	System.out.println(getColid()+"ffffffff");
	
	int i=dl.ApprovedCollg(getColid());
	setMsg("Successfully Approved");
	return "approv";
}
public String rejColg() throws Exception{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetCollg();
	while(rs.next())
	mapForSelect.put(rs.getInt(1),rs.getString(2));
	
	return "dispcoll";
}

public String Rejectclg()throws Exception
{
	System.out.println(getColid()+"ffffffff");
	
	int i=dl.Rejectclg(getColid());
	setMsg("Successfully rejected");
	return "reject";
}
public String CounselMgt()throws Exception{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetStud();
	while(rs.next())
	{
	 mapForSelect.put(rs.getInt(1),rs.getString(1));
	
	}return "dispid";
}
public String Viewregd() throws Exception
{
	Map session =ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs=dl.viewown(logid);
	if(rs.next())
	{
		
		setCoursename(rs.getString(1));
		setRollno(rs.getInt(2));
		setRank(rs.getInt(3));
		setName(rs.getString(4));
		setDateofbirth(rs.getString(5));
		setGuardianname(rs.getString(6));
		setGender(rs.getString(7));
		setCategory(rs.getString(8));
		setState(rs.getString(9));
		setQualification(rs.getString(10));
		setGraduation(rs.getString(11));
		setGradpassingyr(rs.getInt(12));
		setGradpercentage(rs.getInt(13));
		setInterboard(rs.getString(14));
		setInterpassingyr(rs.getInt(15));
		setInterpercentage(rs.getInt(16));
		setSscboard(rs.getString(17));
		setSscpassingyr(rs.getInt(18));
		setSscpercentage(rs.getInt(19));
		setUsername(rs.getString(20));
		setPassword(rs.getString(21));
		setSecurityque(rs.getString(22));
		setAnswer(rs.getString(23));
		setCity(rs.getString(24));
		setDist(rs.getString(25));
		setPin(rs.getInt(26));
		setContactno(rs.getInt(27));
		setEmail(rs.getString(28));
		
	}
	
	return "see";
	}
private String chid;
public String getChid() {
	return chid;
}
public void setChid(String chid) {
	this.chid = chid;
}
private Map<String, String> mapForSelect1;

public Map<String, String> getMapForSelect1() {
	return mapForSelect1;
}
public void setMapForSelect1(Map<String, String> mapForSelect1) {
	this.mapForSelect1 = mapForSelect1;
}
public String ChoiceMgt()throws Exception{
  mapForSelect1 = new HashMap<String,String>();
	ResultSet rs=dl.RetCollg();
	while(rs.next())
	{
	 mapForSelect1.put(rs.getString(2),rs.getString(2));
		}
	Map session=ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs1=dl.view(logid);
	if(rs1.next()){
		setName(rs1.getString(1));
		setRank(rs1.getInt(2));		
	}
	return "choice";
}
private String cid1;
private String cid2;
private String cid3;

public String getCid1() {
	return cid1;
}
public void setCid1(String cid1) {
	this.cid1 = cid1;
}
public String getCid2() {
	return cid2;
}
public void setCid2(String cid2) {
	this.cid2 = cid2;
}
public String getCid3() {
	return cid3;
}
public void setCid3(String cid3) {
	this.cid3 = cid3;
}
public String GiveChoice()throws Exception{
		int i=0;
		
		i=dl.InsertChoice(getName(),getRank(),getCid1(),getCid2(),getCid3(),getBranch());
				setMsg("Successfully inserted");
		return ChoiceMgt();	
		}
public String Editregd() throws Exception
{
	Map session =ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs=dl.viewown(logid);
	if(rs.next())
	{
		
		setCoursename(rs.getString(1));
		setRollno(rs.getInt(2));
		setRank(rs.getInt(3));
		setName(rs.getString(4));
		setDateofbirth(rs.getString(5));
		setGuardianname(rs.getString(6));
		setGender(rs.getString(7));
		setCategory(rs.getString(8));
		setState(rs.getString(9));
		setQualification(rs.getString(10));
		setGraduation(rs.getString(11));
		setGradpassingyr(rs.getInt(12));
		setGradpercentage(rs.getInt(13));
		setInterboard(rs.getString(14));
		setInterpassingyr(rs.getInt(15));
		setInterpercentage(rs.getInt(16));
		setSscboard(rs.getString(17));
		setSscpassingyr(rs.getInt(18));
		setSscpercentage(rs.getInt(19));
		setUsername(rs.getString(20));
		setPassword(rs.getString(21));
		setSecurityque(rs.getString(22));
		setAnswer(rs.getString(23));
		setCity(rs.getString(24));
		setDist(rs.getString(25));
		setPin(rs.getInt(26));
		setContactno(rs.getInt(27));
		setEmail(rs.getString(28));
		
	}
	
	return "edit";
	}
public String updateregd()throws SQLException,ClassNotFoundException
{
	Map session=ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	int i=dl.updateacc(getCoursename(),getRollno(),getRank(),getName(),getDateofbirth(),getGuardianname(),getGender(),getCategory(),getState(),getQualification(),
			getGraduation(),getGradpassingyr(),getGradpercentage(),getInterboard(),getInterpassingyr(),getInterpercentage(),getSscboard(),getSscpassingyr(),getSscpercentage()
			,getUsername(),getPassword(),getSecurityque(),getAnswer(),getCity(),getDist(),getPin(),getContactno(),getEmail(),logid);
	setMsg("successfully updated");
	return "update";
}
private String subject;
private String content;
private String date;

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String noticemgt() throws SQLException
{
	int i=0;
	i=dl.noticemgmt(getSubject(),getContent(),getDate());
	setMsg("notice added");
	return "notices";
	
}
private String nid;


public String getNid() {
	return nid;
}
public void setNid(String nid) {
	this.nid = nid;
}
public String noticemanage()throws Exception{
	  mapForSelect = new HashMap<Integer,String>();
		ResultSet rs=dl.noticesmg();
		while(rs.next())
		{
		 mapForSelect.put(rs.getInt(1),rs.getString(4));
			}
		return "address";
}
public String viewn() throws Exception
{
ResultSet rs=dl.viewnot(getNid());
if(rs.next())
{
	setSubject(rs.getString(2));
	setContent(rs.getString(3));
	setDate(rs.getString(4));
}
return "viewno";
}
private String temp;

public String getTemp() {
	return temp;
}
public void setTemp(String temp) {
	this.temp = temp;
}
private String fsubject;
private String fcontent;
private String fdate;

public String getFsubject() {
	return fsubject;
}
public void setFsubject(String fsubject) {
	this.fsubject = fsubject;
}
public String getFcontent() {
	return fcontent;
}
public void setFcontent(String fcontent) {
	this.fcontent = fcontent;
}
public String getFdate() {
	return fdate;
}
public void setFdate(String fdate) {
	this.fdate = fdate;
}
public String feedbackmgt() throws SQLException
{
	int i=0;
	Map session =ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs=dl.feedback(logid);
	if(rs.next())
	{
		temp=rs.getString(1);
		}
	i=dl.feedbackmgmt(getFsubject(),getFcontent(),getFdate(),getTemp());
	setMsg("feedback added");
	return "feedbacks";
	
}

public String FedbkMgt()throws Exception{
	

	 mapForSelect = new HashMap<Integer,String>();
		ResultSet rs=dl.RetFeed();
		

		while(rs.next())
		{
			
		 mapForSelect.put(rs.getInt(1),rs.getString(5));
		}
		return "viewfeed";
}
private String fid;
public void setFid(String fid) {
	this.fid = fid;
}
public String getFid() {
	return fid;
}
public String ViewFeedBk()throws Exception{
	ResultSet rs=dl.VwFdBk(getFid());
	if(rs.next())
	{
		setName(rs.getString(1));
		setFsubject(rs.getString(2));
		setFcontent(rs.getString(3));
		
		
	}	
	return "adminfeed";
}
private String temp1;

public String getTemp1() {
	return temp1;
}
public void setTemp1(String temp1) {
	this.temp1 = temp1;
}
private String chngp;

public String getChngp() {
	return chngp;
}
public void setChngp(String chngp) {
	this.chngp = chngp;
}
private String chngpp;

public String getChngpp() {
	return chngpp;
}
public void setChngpp(String chngpp) {
	this.chngpp = chngpp;
}
public String changemgt()throws SQLException
{
	int i=0;
	Map session =ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);
	System.out.println(logid);
	ResultSet rs=dl.cpassword(logid);
	if(rs.next())
	{
		temp1=rs.getString(1);
		
		}
	System.out.println(getTemp1()+getPassword());
	if(getTemp1().equals(getPassword()))
			
	{
		if(getChngp().equals(getChngpp()))
		{
		i=dl.changepass(getPassword(),getChngp(),logid);	
		setMsg("Password is changed");
	    }
		else
		{
			setMsg("new password and confirm password is not matched");
		}
	}
	else
	{
		setMsg("Old password is not Correct");
	}
	
	return "cpassword";
}

public String slctmba() throws SQLException{
	mapForSelect = new HashMap<Integer,String>();
	ResultSet rs=dl.slmba();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "selectmba";
	
}

public String viewmba() throws Exception
{
	ResultSet rs=dl.SelectCollege(getCid());
	if(rs.next())
	{
		setClgname(rs.getString(2));
		setAddress(rs.getString(3));
	    setYearofestablishment(rs.getInt(4));
	    setCemail(rs.getString(5));
	    setWeb(rs.getString(6));
	    setDescription(rs.getString(7));
	    setUniversity(rs.getString(8));
	    setCtype(rs.getString(9));
	    setPhno(rs.getLong(10));
	    setCollegecode(rs.getLong(11));
	    setBranch(rs.getString(12));
	    setSeats(rs.getInt(13));
	    setCoursename(rs.getString(15));
	}
	return "vmba";
	
}
public String slctmca() throws SQLException{
	mapForSelect = new HashMap<Integer,String>();
	ResultSet rs=dl.slmca();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "selectmca";
	
}
public String viewmca() throws Exception
{
	ResultSet rs=dl.SelectCollege(getCid());
	if(rs.next())
	{
		setClgname(rs.getString(2));
		setAddress(rs.getString(3));
	    setYearofestablishment(rs.getInt(4));
	    setCemail(rs.getString(5));
	    setWeb(rs.getString(6));
	    setDescription(rs.getString(7));
	    setUniversity(rs.getString(8));
	    setCtype(rs.getString(9));
	    setPhno(rs.getLong(10));
	    setCollegecode(rs.getLong(11));
	    setBranch(rs.getString(12));
	    setSeats(rs.getInt(13));
	    setCoursename(rs.getString(15));
	}
	return "vmca";
	
}
public String slctbtech() throws SQLException{
	mapForSelect = new HashMap<Integer,String>();
	ResultSet rs=dl.slbtech();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "selectbtech";
	
}
public String viewbtech() throws Exception
{
	ResultSet rs=dl.SelectCollege(getCid());
	if(rs.next())
	{
		setClgname(rs.getString(2));
		setAddress(rs.getString(3));
	    setYearofestablishment(rs.getInt(4));
	    setCemail(rs.getString(5));
	    setWeb(rs.getString(6));
	    setDescription(rs.getString(7));
	    setUniversity(rs.getString(8));
	    setCtype(rs.getString(9));
	    setPhno(rs.getLong(10));
	    setCollegecode(rs.getLong(11));
	    setBranch(rs.getString(12));
	    setSeats(rs.getInt(13));
	    setCoursename(rs.getString(15));
	}
	return "vbtech";
	
}
public void reset(){
	this.name="";
	this.rollno=0;
	this.rank=0;
	this.coursename="";
	this.dateofbirth="";
	this.guardianname="";
	this.gender="";
	this.category="";
	this.state="";
	this.qualification="";
	this.graduation="";
	this.gradpassingyr=0;
	this.gradpercentage=0;
	this.interboard="";
	this.interpassingyr=0;
	this.interpercentage=0;
	this.sscboard="";
	this.sscpassingyr=0;
	this.sscpercentage=0;
	this.username="";
	this.password="";
	this.securityque="";
	this.answer="";
	this.city="";
	this.dist="";
	this.pin=0;
	this.phno=null;
	this.email="";
	this.stdid=null;
	this.type="";

	this.clgname="";
	this.address="";
	this.yearofestablishment=0;
	this.cemail="";
	this.web=""; 
	this.description="";
	this.university=""; 
	this.ctype="";
	this.phno=null;
	
	this.collegecode=null;
	this.branch="";
	this.seats=0; 
	this.coursename="";
	this.cid=null;
	this.chid1="";
	this.chid2="";
	
	this.rkno=0;
	this.choid=0;
	this.altinst="";
	this.altbrnch="";
	this.chngp="";
	this.chngpp="";
	
	this.fid="";
	this.temp="";
	this.fdate="";
	this.fsubject="";
	this.fcontent="";
	this.subject="";
	this.content="";
	this.date="";
	this.nid="";
	this.msg="";
}

private String chid1;
private String chid2;
public String getChid1() {
	return chid1;
}
public void setChid1(String chid1) {
	this.chid1 = chid1;
}
public String getChid2() {
	return chid2;
}
public void setChid2(String chid2) {
	this.chid2 = chid2;
}
private int choid;
private String altinst;
private String altbrnch;
public String getAltinst() {
	return altinst;
}
public void setAltinst(String altinst) {
	this.altinst = altinst;
}
public String getAltbrnch() {
	return altbrnch;
}
public void setAltbrnch(String altbrnch) {
	this.altbrnch = altbrnch;
}
public int getChoid() {
	return choid;
}
public void setChoid(int choid) {
	this.choid = choid;
}
public String allotment()throws Exception{
	Long id=Long.parseLong(stdid);
	ResultSet rs=dl.CounselDet(id);
	if(rs.next()){
		setStdid(rs.getString(1));
		setName(rs.getString(2));
		setDateofbirth(rs.getString(3));
		setRank(rs.getInt(4));
		setChoid(rs.getInt(4));
		setGuardianname(rs.getString(5));
		setCategory(rs.getString(6));
	}
	 int id1=getChoid();
	ResultSet rs1=dl.CoDet(id1);
	if(rs1.next()){
		setAltinst(rs1.getString(1));
		setAltbrnch(rs1.getString(2));
	}
	return "alloted";
}
public String Allot()throws Exception{
	int x=0;
	x=dl.Allotment(getStdid(),getName(),getDateofbirth(),getRank(),getGuardianname(),getCategory(),getAltinst(),getAltbrnch());
	setMsg("Alloted");
	return "allot";
}
private int rkno;
public void setRkno(int rkno) {
	this.rkno = rkno;
}
public int getRkno() {
	return rkno;
}
public String StudViewConsel()throws Exception
{
	ResultSet rs=dl.RetRank(getRkno());
	if(rs.next()){
		setStdid(rs.getString(1));
		setName(rs.getString(2));
		setRank(rs.getInt(4));
		setCategory(rs.getString(6));
		setAltinst(rs.getString(7));
		setAltbrnch(rs.getString(8));
	}
	setMsg("confimed");
	return "viewcnsl";

}
public String logoutadmin()throws Exception
{
	Map session =ActionContext.getContext().getSession();
	session.clear();
	Map session1 =ActionContext.getContext().getSession();
	session1.clear();
	return "logout";
}
public String PrntRegCard()throws Exception{
	Map session=ActionContext.getContext().getSession();
	String id=(String)session.get("LOGINID");
	Long logid=Long.parseLong(id);	
	ResultSet rs=dl.RetRank1(logid);
	if(rs.next()){
		setStdid(rs.getString(1));
		setName(rs.getString(2));
		setDateofbirth(rs.getString(3));
		setRank(rs.getInt(4));
		setGuardianname(rs.getString(5));
		setCategory(rs.getString(6));
		setAltinst(rs.getString(7));
		setAltbrnch(rs.getString(8));
		setCoursename(rs.getString(9));
	}
	return "print";
}
public String ViewColl()throws Exception{
	Map session1=ActionContext.getContext().getSession();
	String id=(String)session1.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs=dl.ViewCollDet(logid);
	if(rs.next())
	{
		setUsername(rs.getString(1));
		setPassword(rs.getString(2));
		setClgname(rs.getString(3));
		setUniversity(rs.getString(4));
		setSeats(rs.getInt(5));
		setYearofestablishment(rs.getInt(6));	
		setCemail(rs.getString(7));
		setWeb(rs.getString(8));
		setCtype(rs.getString(9));
		setPhno(rs.getLong(10));
	
		setCollegecode(rs.getLong(11));
		setBranch(rs.getString(12));
		setAddress(rs.getString(13));
		setDescription(rs.getString(14));
		setCoursename(rs.getString(15));
	}
	return "viewcolg";
}
public String EditColl()throws Exception{
	Map session1=ActionContext.getContext().getSession();
	String id=(String)session1.get("LOGINID");
	Long logid=Long.parseLong(id);
	ResultSet rs=dl.ViewCollDet(logid);
	if(rs.next())
	{
		setUsername(rs.getString(1));
		setPassword(rs.getString(2));
		setClgname(rs.getString(3));
		setUniversity(rs.getString(4));
		setSeats(rs.getInt(5));
		setYearofestablishment(rs.getInt(6));	
		setCemail(rs.getString(7));
		setWeb(rs.getString(8));
		setCtype(rs.getString(9));
		setPhno(rs.getLong(10));
		
		setCollegecode(rs.getLong(11));
		setBranch(rs.getString(12));
		setAddress(rs.getString(13));
		setDescription(rs.getString(14));
		setCoursename(rs.getString(15));
	}
	return "editcolg";
	}
public String UpdColl()throws Exception{
	System.out.println("hhh");
	Map session1=ActionContext.getContext().getSession();
	String id=(String)session1.get("LOGINID");
	Long logid=Long.parseLong(id);	
	int p=dl.UpdColl(getUsername(),getPassword(),getClgname(),getUniversity(),getSeats(),getYearofestablishment(),getCemail(),getWeb(),getPhno(),getCollegecode(),getAddress(),getDescription(),getCoursename(),logid);
	setMsg("Updated Successfully");
	return "updatecolg";
	
}
}









