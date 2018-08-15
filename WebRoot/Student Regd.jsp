<%@ taglib uri="/struts-tags" prefix="s" %>
<html><head><title>Viziora</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="main.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function validatestudent(stut)
{
 var cname=stut.coursename.value;
 if(cname.length==0)
  {
   alert("Course name Must Not Blank");
   stut.coursename.focus();
   return false;
  }
  var rno=stut.rollno.value;
  if(rno.length==0)
  {
   alert("Give the roll no");
   stut.rollno.focus();
   return false;
  } 
  var rnk=stut.rank.value;
  if(rnk.length==0)
  {
   alert("provide the rank of the student");
   stut.rank.focus();
   return false;
  }
  var sname=stut.name.value;
  if(sname.length==0)
  {
     alert("Give the name of the student");
     stut.name.focus();
     return false;
   }
   
  var dob=stut.dateofbirth.value;
  if(dob.length==0)
  {
  alert("give the date of birth");
  stut.dateofbirth.focus();
  return false;
  }
  var gdname=stut.guardianname.value;
  if(gdname.length==0)
  {
  alert("provide the guardian name");
  stut.guardianname.focus();
  return false;
  }
  var qual=stut.qualification.value;
  if(qual.length==0)
  {
   alert("Give the qualification");
   stut.qualification.focus();
   return false;
  }
  var graduniv=stut.graduation.value;
  if(graduniv.length==0)
  {
   alert("provide the graduation university name");
   stut.graduation.focus();
   return false;
  }
  var grdpy=stut.gradpassingyr.value;
  if(grdpy.length==0)
  {
   alert("provide the graduation passing year");
   stut.gradpassingyr.focus();
   return false;
  }
  
  var gradp=stut.gradpercentage.value;
  if(gradp.length==0)
  {
   alert("Provide the graduation percentage");
   stut.gradpercentage.focus();
   return false;
  }
  var intb=stut.interboard.value;
  if(intb.length==0)
  {
   alert("give the +2 board name");
   stut.interboard.focus();
   return false;
  }
  var intb=stut.interpassingyr.value;
  if(intb.length==0)
  {
   alert("give the +2 passing year");
   stut.interpassingyr.focus();
   return false;
  }
  var intp=stut.interpercentage.value;
  if(intp.length==0)
  {
   alert("Give the +2 percentage");
   stut.interpercentage.focus();
   return false;
  }
  var sscb=stut.sscboard.value;
  if(sscb.length==0)
  {
   alert("give the 10th board name");
   stut.sscboard.focus();
   return false;
  }
  var sscp=stut.sscpassingyr.value;
 if(sscp.length==0)
  {
   alert("give the ssc passing year");
   stut.sscpassingyr.focus();
   return false;
  }
  var sscpr=stut.sscpercentage.value;
 if(sscpr.length==0)
  {
   alert("give the 10th percentage");
   stut.sscpercentage.focus();
   return false;
  }
  var uname=stut.username.value;
  if(uname.length==0)
  {
   alert("Provide the username");
   stut.username.focus();
   return false;
  }
  var pwd=stut.password.value;
  if(pwd.length==0)
  {
   alert("password field must not blank");
   stut.password.focus();
   return false;
  }
  var conpassword=stut.confirmpassword.value;
  if(conpassword.length==0)
  {
   alert("password field must not blank");
   stut.confirmpassword.focus();
   return false;
  }
  
  return true;
 }
 
</script>
</head><body bgcolor="#E9F2F9">
<table width="765" border="0" align="center" cellpadding="0" cellspacing="0">
<tr><td height="76"><a href="index.html" class="sitenametitle">e-COUNSELLING</a>
</td>
</tr>
  <tr>
    <td height="44"><div id="navcontainer">
                        <ul id="navlist"><!-- CSS Tabs -->
						<li id="active"><a id="current" href="index.htm">HOME</a></li>
						<li><a href="aboutus.jsp">ABOUT US</a></li>
						<li><a href="#">CONTACT US</a></li>
						</ul>
					</div>	</td>
  </tr>
  <tr>
            <td><img src="images/img_banner.jpg" width="765" height="190"></td>
  </tr>
          <tr>
            <td valign="top" class="body_txt" background="images/ctnt_bg.gif" style="padding:10px 10px 3px 10px;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td valign="top"><table width="216" border="0" cellspacing="0" cellpadding="0">
          
          <tr>
            <td><img src="images/leftbartop.gif" width="216" height="12"></td>
          </tr>
          <tr>
            <td height="30" bgcolor="#09938d" class="leftcolumntitle, titlebold"><span class="columntitle">New Registration</span></td>
          </tr>
          <tr>
            <td background="images/leftbarbg.gif" valign="top" style="padding:8px 0 8px 0"><div id="menu2">
                        <ul>
                                <!-- CSS Tabs -->
<body>
                
                <li><font size="2"> <a href="MBA Regd.jsp">MBA Registration</a></font></li><br/><br/><br/>
                
                <li><font size="2"><a href="MCA Regd.jsp">MCA Registration</a></font></li><br/><br/><br/>
                <li><font size="2"><a href="B-TECH Regd.jsp">B-TECH Registration</a></font></li><br/><br/><br/>
              
                </body>
              

                        </ul>
                </div></td>
          </tr>
          <tr>
            <td height="30" bgcolor="#09938d" class="leftcolumntitle, titlebold"><br></td>
          </tr>
          <tr>
            <td background="images/leftbarbg.gif">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" background="images/leftbarbg.gif"><br><br><br><br></td>
          </tr>
          <tr>
            <td><img src="images/leftbarbtm.gif" width="216" height="12"></td>
          </tr>
        </table></td>
                <td style="padding:0 20px 10px 25px" valign="top"><p><span class="titlebold2"></span>
                <body>
                <h3><font color="#009867" size=3>STUDENT REGISTRATION PAGE</font></h3>
                <s:form action="Register" onsubmit="return validatestudent(this)">
             <tr><td><s:textfield name="coursename" label=" Course Name"/></td></tr>
            <tr><td><s:textfield name="rollno" label=" Roll No"/></td></tr>
             <tr><td><s:textfield name="rank" label="Rank"/></td></tr>
            <tr><td><s:textfield name="name" label="Candidate Name"/></td></tr>
            <tr><td><s:textfield name="dateofbirth" label="Date Of Birth"/></td></tr>
            <tr><td><s:textfield name="guardianname"label=" Guardian Name"/></td></tr>
            
            <tr><td><s:radio name="gender" label=" Gender" list="{'Male','Female'}"/></td></tr>
            <tr><td><s:checkboxlist name="category" label="Category" list="{'SC','ST','General','Ex-servicemen','Women'}"/></td></tr>
            <tr><td><s:select name="state" label="State"list="{'orissa','Bihar','Assam'}"headerKey="-1"headerValue="--SELECT--"/></td></tr>
             <tr><td><s:textfield name="qualification" label="Qualification"/></td></tr>
              <tr><td><s:textfield name="graduation" label="Graduation University"/></td></tr>
             <tr><td><s:textfield name="gradpassingyr" label="Year Of Passing"/></td></tr>
              <tr><td><s:textfield name="gradpercentage" label="Percentage Of Marks"/></td></tr>
             <tr><td><s:textfield name="interboard" label="+2 University/Board"/></td></tr>
           <tr><td><s:textfield name="interpassingyr" label="Year Of Passing"/></td></tr>
              <tr><td><s:textfield name="interpercentage" label="Percentage Of Marks"/></td></tr>
             <tr><td><s:textfield name="sscboard" label="10th Board"/></td></tr>
             <tr><td><s:textfield name="sscpassingyr" label="Year Of Passing"/></td></tr>
              <tr><td><s:textfield name="sscpercentage" label="Percentage Of Marks"/></td></tr>
               <tr><td> <s:textfield name="username" label="username"/></td></tr>
              <tr><td> <s:password name="password" label="Password"/></td></tr>
              <tr><td> <s:password name="confirmpassword" label=" Confirm Password"/></td></tr>
               <tr><td><s:select name="securityque" label="Security Question" list="{'what is your mothers name','what is your pet name'}" headerKey="-1"headerValue="--SELECT--"/></td></tr>
               <tr><td> <s:textfield name="answer" label="Answer"/></td></tr>
               <tr><td> <s:textfield name="city" label="City"/></td></tr>  
                <tr><td> <s:textfield name="dist" label="District"/></td></tr>
                 <tr><td> <s:textfield name="pin" label="Pincode"/></td></tr>
                  <tr><td> <s:textfield name="contactno" label="Contact No"/></td></tr>
                   <tr><td> <s:textfield name="email" label="E-mail"/></td></tr>
                 <tr><td> <s:submit value="Register"/></td></tr>
                
                </s:form>
                </body>
                
                
                <br></p>
                <br><p><br></p><p><span class="titlebold2"></span><br></p><br></td>
              </tr>
            </table>
            </td>
          </tr>
          <tr>
            <td><img src="images/ftr_btm.gif" width="765" height="27"></td>
          </tr>
          <tr>
            <td align="center" class="txt_copyright" style="padding:3px 10px 10px 10px;">Designed by , Thanks to <br></td>
  </tr>
        </table>
</td>
      </tr>
    </table><td></td>
  </tr>
</table>
</body></html>