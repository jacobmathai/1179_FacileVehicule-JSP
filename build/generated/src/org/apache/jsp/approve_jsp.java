package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class approve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      conn.connection obj = null;
      synchronized (_jspx_page_context) {
        obj = (conn.connection) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new conn.connection();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <title>Facile Vechicule</title>\n");
      out.write("\n");
      out.write("    <link href=\"scripts/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"scripts/bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"scripts/icons/general/stylesheets/general_foundicons.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"scripts/icons/social/stylesheets/social_foundicons.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"scripts/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"scripts/carousel/style.css\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"scripts/camera/css/camera.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Syncopate\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Pontano+Sans\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Oxygen\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <link href=\"styles/custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"pageBody\">\n");
      out.write("\n");
      out.write("<div id=\"divBoxed\" class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"transparent-bg\" style=\"position: absolute;top: 0;left: 0;width: 100%;height: 100%;z-index: -1;zoom: 1;\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"divPanel notop nobottom\">\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span12\">\n");
      out.write("\n");
      out.write("                    <div id=\"divLogo\" class=\"pull-left\">\n");
      out.write("                        <img src=\"slider-images/easy.jpg\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"divMenuRight\" class=\"pull-right\">\n");
      out.write("                    <div class=\"navbar\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-navbar-highlight btn-large btn-primary\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                            NAVIGATION <span class=\"icon-chevron-down icon-white\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"nav-collapse collapse\">\n");
      out.write("                            <ul class=\"nav nav-pills ddmenu\">\n");
      out.write("                            <li class=\"active\"><a href=\"admin_homepage.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"homepage.jsp\">Logout</a></li>\n");
      out.write("                                                    \n");
      out.write("                            </ul>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <h3 align=\"center\"><b><u>AVAILABLE ROUTES</u></b></h3>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"frm\">\n");
      out.write("            <table border=\"0\" align=\"left\" cellspacing=\"20\" cellpadding=\"5\">\n");
      out.write("                  <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td><a href=\"add_bus.jsp\">ADD NEW BUS</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td><a href=\"bus_route.jsp\">BUS AND ROUTE</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                        <td><a href=\"admin_view_bus.jsp\">VIEW BUS DETAILS</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"adminchangepwd.jsp\">CHANGE PASSWORD</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"route.jsp\">ESTABLISH A ROUTE</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"place.jsp\">ADD PLACE</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"schedule.jsp\">SCHEDULE TIME</a></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("      <table border=\"1\" align=\"center\">\n");
      out.write("            <tbody>\n");
      out.write("                 <tr>\n");
      out.write("                        <th>Slno</th>\n");
      out.write("\n");
      out.write("                        <th>Start Place</th>\n");
      out.write("\n");
      out.write("                        <th>Intermediates</th>\n");
      out.write("\n");
      out.write("                        <th>End Place</th>\n");
      out.write("\n");
      out.write("                        <th>Action</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                     ");

                    int cnt=1;
                    String b_id=request.getParameter("id");
                    System.out.println("b_id"+b_id);
                    String sel="select * from tb_route";
                    ResultSet rs=obj.select(sel);
                    while(rs.next())
                        {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(cnt);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("r_start_place"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("r_intermediates"));
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs.getString("r_end_place"));
      out.write("</td>\n");
      out.write("                         <td><a href=\"view_schedule.jsp?id1=");
      out.print(rs.getString("r_id"));
      out.write("&id=");
      out.print(b_id);
      out.write("\">Time Schedule</a></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

cnt++;
                    }

 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("     <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <div id=\"footerOuterSeparator\"></div>\n");
      out.write("\n");
      out.write("    <div id=\"divFooter\" class=\"footerArea\">\n");
      out.write("\n");
      out.write("        <div class=\"divPanel\">\n");
      out.write("\n");
      out.write("            <br /><br />\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                <div class=\"span12\">\n");
      out.write("                    <p class=\"copyright\">\n");
      out.write("                        Copyright © 2014. All Rights Reserved.\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <p class=\"social_bookmarks\">\n");
      out.write("                        <a href=\"#\"><i class=\"social foundicon-facebook\"></i> Facebook</a>\n");
      out.write("\t\t\t<a href=\"\"><i class=\"social foundicon-twitter\"></i> Twitter</a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"social foundicon-pinterest\"></i> Pinterest</a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"social foundicon-rss\"></i> Rss</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br /><br /><br />\n");
      out.write("\n");
      out.write("<script src=\"scripts/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"scripts/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"scripts/default.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"scripts/carousel/jquery.carouFredSel-6.2.0-packed.js\" type=\"text/javascript\"></script><script type=\"text/javascript\">$('#list_photos').carouFredSel({ responsive: true, width: '100%', scroll: 2, items: {width: 320,visible: {min: 2, max: 6}} });</script><script src=\"scripts/camera/scripts/camera.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"scripts/easing/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">function startCamera() {$('#camera_wrap').camera({ fx: 'scrollLeft', time: 2000, loader: 'none', playPause: false, navigation: true, height: '35%', pagination: true });}$(function(){startCamera()});</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
