<%@ taglib uri="/struts-tags" prefix="s" %>
<html><head><title>Viziora</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="main.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function validatebtech(frem)
{
 var cname=frem.clgname.value;
 if(cname.length==0)
  {
   alert("College name Must Not Blank");
   frem.clgname.focus();
   return false;
  }
  var addr=frem.address.value;
  if(addr.length==0)
  {
   alert("Address Field Must Not Blank");
   frem.address.focus();
   return false;
  } 
  var estd=frem.yearofestablishment.value;
  if(estd.length==0)
  {
   alert("Give the year of establishment");
   frem.yearofestablishment.focus();
   return false;
  }
  var clgmail=frem.cemail.value;
  if(clgmail.length==0)
    {
      alert("Give the email-id of the college");
      frem.cemail.focus();
      return false;
      }
  var webs=frem.web.value;
  if(webs.length==0)
  {
  alert("give the college website");
  frem.web.focus();
  return false;
  }
  var webs=from.description.value;
  if(webs.length==0)
  {
  alert("give the college description");
  frem.description.focus();
  return false;
  }
  var univ=frem.university.value;
  if(univ.length==0)
  {
   alert("Give the name of the University");
   frem.university.focus();
   return false;
  }
  var phn=frem.phno.value;
  if(phn.length==0)
  {
   alert("College phone number must not blank");
   frem.phno.focus();
   return false;
  }
  var clgcode=frem.collegecode.value;
  if(clgcode.length==0)
  {
   alert("Provide the college code");
   frem.collegecode.focus();
   return false;
  }
  
  var uname=frem.username.value;
  if(uname.length==0)
  {
   alert("Provide the username");
   frem.username.focus();
   return false;
  }
  var pwd=frem.password.value;
  if(pwd.length==0)
  {
   alert("password field must not blank");
   frem.password.focus();
   return false;
  }
  var conpassword=frem.colpassword.value;
  if(conpassword.length==0)
  {
   alert("password field must not blank");
   frem.colpassword.focus();
   return false;
  }
  var seat=frem.seats.value;
  if(seat.length==0)
  {
   alert("Give the no of seats");
   frem.seats.focus();
   return false;
  }
  var crsename=frem.coursename.value;
  if(crsename.length==0)
  {
   alert("course name must not blank");
   frem.coursename.focus();
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
						<li><a href="contactus.jsp">CONTACT US</a></li>
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
            <td height="30" bgcolor="#09938d" class="leftcolumntitle, titlebold"><span class="columntitle">BTECH Registration<br></span></td>
          </tr>
          <tr>
            <td background="images/leftbarbg.gif" valign="top" style="padding:8px 0 8px 0"><div id="menu2">
                        <ul>
                                <!-- CSS Tabs -->
<body>
                
                <li><font size="2"> <a href="Student Regd.jsp">Student Registration</a></font></li><br/><br/><br/>
                
                <li><font size="2"><a href="MBA Regd.jsp">MBA Registration</a></font></li><br/><br/><br/>
                <li><font size="2"><a href="MCA Regd.jsp">MCA Registration</a></font></li><br/><br/><br/>
              
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
                <h3 ><font color="#009867" size=3>B-TECH COLLEGE REGISTRATION</font></h3>
                 <table>
                <s:form action="btechReg" onsubmit="return validatebtech(this)">
             <tr><td><s:textfield name="clgname"label="Name"/></td></tr>
             <tr><td> <s:textarea name="address"label="Address"/></td></tr>
             <tr><td> <s:textfield name="yearofestablishment"label="Year Of Establishment"/></td></tr>
              <tr><td> <s:textfield name="cemail"label="E-mail"/></td></tr>  
              <tr><td> <s:textfield name="web"label="Web"/></td></tr>
              <tr><td> <s:textfield name="description"label="Description"/></td></tr>
              <tr><td> <s:textfield name="university"label="University"/></td></tr>
             
              <tr><td> <s:radio name="ctype"label="Type"list="{'Govt','Pvt'}"/></td></tr>
              <tr><td> <s:textfield name="phno"label="Phone no"/></td></tr>
              
              <tr><td> <s:textfield name="collegecode"label="College Code"/></td></tr>
              <tr><td><s:radio name="branch"label="Branches"list="{'IT','Comp.Sc','Electrical','Mechanical','ETC','EEE','Marine','Civil'}"/></td></tr>
              <tr><td> <s:textfield name="username"label="User Name"/></td></tr>
              <tr><td> <s:password name="password"label="Password"/></td></tr>
              <tr><td> <s:password name="colpassword"label=" Confirm Password"/></td></tr>
               <tr><td> <s:textfield name="seats"label="No Of Seats"/></td></tr>
                <tr><td> <s:textfield name="coursename"label="Course Name"/></td></tr>
                 <tr><td> <s:submit value="Register"/></td></tr>
                
                </s:form>
                </table>
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
            <td align="center" class="txt_copyright" style="padding:3px 10px 10px 10px;">Designed by <font color="blue"></font>, Thanks to <font color="blue">InterFace Software</font><br></td>
  </tr>
        </table>
</td>
      </tr>
    </table></td>
  </tr>
</table>
</body></html>