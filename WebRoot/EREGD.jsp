<%@ taglib uri="/struts-tags" prefix="s" %>
<html><head><title>Viziora</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="main.css" rel="stylesheet" type="text/css">
</head><body bgcolor="#E9F2F9">
<table width="765" border="0" align="center" cellpadding="0" cellspacing="0">
<tr><td height="76"><a href="index.html" class="sitenametitle">e-COUNSELLING</a>
</td>
</tr>
  <tr>
    <td height="44"><div id="navcontainer">
                        <ul id="navlist"><!-- CSS Tabs -->
						<li id="active"><a id="current" href="Home.jsp">HOME</a></li>
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
            <td height="30" bgcolor="#09938d" class="leftcolumntitle, titlebold"><span class="columntitle">Student Home</span></td>
          </tr>
          <tr>
            <td background="images/leftbarbg.gif" valign="top" style="padding:8px 0 8px 0"><div id="menu2">
                        <ul>
                                <!-- CSS Tabs -->
<li><a id="current" href="view">View Registration Detail</a></li>


<li><a href="colleges.jsp">View Colleges</a></li>
<li><a href="GiveChmgt">Give Choices</a></li>

<li><a href="VCOUNSELLING.jsp">View Counselling</a></li>
<li><a href="provisional">Print provisional letter</a></li>
<li><a href="changepassword.jsp">Change Password</a></li>
<li><a href="LETTER.jsp">Provisional Allotment Letter</a></li>
<li><a href="viewnotice"> View Notice</a></li>
<li><a href="feedback.jsp">Give Feedback</a></li>



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
                 <h3 align="center" style="background-color: rgb(255, 128, 255);"><font color="#0000ff"><u><font face="Goudy Stout">Edit Registration Details</font></u></font></h3>
                 <s:form action="update">
                 <tr><td><s:textfield name="coursename" label="Course Name"/></td></tr>
                 <tr><td><s:textfield name="rollno" label="Roll no of Entrance Test"/></td></tr>
                 <tr><td><s:textfield name="rank" label="Rank no"/></td></tr>
                 <tr><td><s:textfield name="name" label="Candidate Name"/></td></tr>
                 <tr><td><s:textfield name="dateofbirth" label="Date of Birth"/></td></tr>
                 <tr><td><s:textfield name="guardianname" label="Guardian Name"/></td></tr>
                 
                 <tr><td><s:radio name="gender" label="Gender" list="{'Male','Female'}"/></td></tr>
                  <tr><td><s:checkboxlist name="category" label="Category" list="{'General','SC','ST','Ex-Servicemen','Women'}"/></td></tr>
                 <tr><td><s:select name="state" label="State" list="{'Orissa','Bihar','Assam'}" headerKey="-1" headerValue="--Select--"/></td></tr>
                 <tr><td><s:textfield name="qualification" label="Qualification"/></td></tr>
                 <tr><td><s:textfield name="graduation" label="Graduation University"/></td></tr>
                 <tr><td><s:textfield name="gradpassingyr" label="Year of passing(Graduation)"/></td></tr>
                 <tr><td><s:textfield name="gradpercentage" label="Percentage of marks"/></td></tr>
                 <tr><td><s:textfield name="interboard" label="12th Board"/></td></tr>
                 <tr><td><s:textfield name="interpassingyr" label="Year of passing(12th)"/></td></tr>
                 <tr><td><s:textfield name="interpercentage" label="Percentage of marks"/></td></tr>
                 <tr><td><s:textfield name="sscboard" label="10th Board"/></td></tr>
                 <tr><td><s:textfield name="sscpassingyr" label="Year of pass(10th)"/></td></tr>
                 <tr><td><s:textfield name="sscpercentage" label="Percentage of marks"/></td></tr>
                 <tr><td><s:textfield name="username" label="Username"/></td></tr>
                 <tr><td><s:textfield name="password" label="Password"/></td></tr>
                 
       <tr><td><s:select name="securityque" label="Security Question" list="{'what is your mothers name','what is your pet name'}" headerKey="-1" headerValue="_ _Select_ _"/></td></tr>
                   <tr><td><s:textarea name="answer" label="Answer"/></td></tr>
                   <tr><td><s:textfield name="city" label="City"/></td></tr>
                   <tr><td><s:textfield name="dist" label="District"/></td></tr>
                   <tr><td><s:textfield name="pin" label="Pincode"/></td></tr>
                   <tr><td><s:textfield name="contactno" label="Contact No."/></td></tr>
                   <tr><td><s:textfield name="email" label="E-mail"/></td></tr>
                  <tr><td colspan="2" align="right"><s:submit value="Update"/></td></tr>
                    <tr><td><font color="red" size="4"><s:property value="msg"/></font></td></tr></s:form>
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
            <td align="center" class="txt_copyright" style="padding:3px 10px 10px 10px;">Designed by <font color="blue">ARUN</font>, Thanks to <font color="blue">InterFace Software</font><br></td>
  </tr>
        </table>
</td>
      </tr>
    </table></td>
  </tr>
</table>
</body></html>