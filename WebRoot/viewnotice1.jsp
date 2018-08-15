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
						<li id="active"><a id="current" href="index.htm">HOME</a></li>
						<li><a href="#">ABOUT US</a></li>
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
            <td height="30" bgcolor="#09938d" class="leftcolumntitle, titlebold"><span class="columntitle">ONLINE RESOURCES<br></span></td>
          </tr>
          <tr>
            <td background="images/leftbarbg.gif" valign="top" style="padding:8px 0 8px 0"><div id="menu2">
                        <ul>
                                <!-- CSS Tabs -->
<li><a id="current" href="view">View Registration Detail</a></li>
<li><a href="edit">Edit Registration Detail</a></li>

<li><a href="colleges.jsp">View Colleges</a></li>
<li><a href="GiveChmgt">Give Choices</a></li>

<li><a href="VCOUNSELLING.jsp">View Counselling</a></li>
<li><a href="provisional">Print provisional letter</a></li>
<li><a href="changepassword.jsp">Change Password</a></li>
<li><a href="LETTER.jsp">Provisional Allotment Letter</a></li>

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
                 <h3>VIEW NOTICE PAGE-1</h3>
                 <s:form action="notice1">
                 <s:select name="nid" label="Choose a date to view notice" list="mapForSelect" headerKey="-1" headerValue="--select date--">
                 </s:select>
                 <s:submit value="view"></s:submit>
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
            <td align="center" class="txt_copyright" style="padding:3px 10px 10px 10px;">Designed by <font color="blue">ARUN</font>, Thanks to <font color="blue">InterFace Software</font><br></td>
  </tr>
        </table>
</td>
      </tr>
    </table></td>
  </tr>
</table>
</body></html>