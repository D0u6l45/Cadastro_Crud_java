package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <!--[if IE 6]>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"iecss.css\" />\n");
      out.write("        <![endif]-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boxOver.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"main_container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"top_right\">\n");
      out.write("                    <div class=\"languages\">\n");
      out.write("                        <div class=\"lang_text\">Languages:</div>\n");
      out.write("                        <a href=\"#\" class=\"lang\"><img src=\"images/en.gif\" alt=\"\" border=\"0\" /></a> <a href=\"#\" class=\"lang\"><img src=\"images/de.gif\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("                    <div class=\"big_banner\"> <a href=\"#\"><img src=\"images/banner728.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img src=\"images/logo.png\" alt=\"\" border=\"0\" width=\"182\" height=\"85\" /></a> </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main_content\">\n");
      out.write("                <div id=\"menu_tab\">\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"#\" class=\"nav\"> Home </a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav\">Products</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav\">Specials</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav\">My account</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav\">Sign Up</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav\">Shipping </a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"contact.html\" class=\"nav\">Contact Us</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"details.html\" class=\"nav\">Details</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of menu tab -->\n");
      out.write("                <div class=\"crumb_navigation\"> Navigation: <span class=\"current\">Home</span> </div>\n");
      out.write("                <div class=\"left_content\">\n");
      out.write("                    <div class=\"title_box\">Categories</div>\n");
      out.write("                    <ul class=\"left_menu\">\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Power Tools</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Air Tools</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Hand Tools</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Accessories</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Workwear</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Spare Parts</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Power Tools</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Air Tools</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Hand Tools</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Accessories</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Workwear</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Spare Parts</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"title_box\">Special Products</div>\n");
      out.write("                    <div class=\"border_box\">\n");
      out.write("                        <div class=\"product_title\"><a href=\"#\">Makita 156 MX-VL</a></div>\n");
      out.write("                        <div class=\"product_img\"><a href=\"#\"><img src=\"images/p1.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title_box\">Newsletter</div>\n");
      out.write("                    <div class=\"border_box\">\n");
      out.write("                        <input type=\"text\" name=\"newsletter\" class=\"newsletter_input\" value=\"your email\"/>\n");
      out.write("                        <a href=\"#\" class=\"join\">subscribe</a> </div>\n");
      out.write("                    <div class=\"banner_adds\"> <a href=\"#\"><img src=\"images/bann2.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of left content -->\n");
      out.write("                <div class=\"center_content\">\n");
      out.write("                    <div class=\"oferta\"> <img src=\"images/p1.png\" width=\"165\" height=\"113\" border=\"0\" class=\"oferta_img\" alt=\"\" />\n");
      out.write("                        <div class=\"oferta_details\">\n");
      out.write("                            <div class=\"oferta_title\">Power Tools BST18XN Cordless</div>\n");
      out.write("                            <div class=\"oferta_text\"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>\n");
      out.write("                            <a href=\"#\" class=\"prod_buy\">details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center_title_bar\">Latest Products</div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Makita 156 MX-VL</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p1.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Bosch XC</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p2.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Lotus PP4</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p4.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Makita 156 MX-VL</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p3.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Bosch XC</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p5.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Lotus PP4</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p6.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"center_title_bar\">Recomended Products</div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Makita 156 MX-VL</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p7.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Bosch XC</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p1.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"prod_box\">\n");
      out.write("                        <div class=\"center_prod_box\">\n");
      out.write("                            <div class=\"product_title\"><a href=\"#\">Lotus PP4</a></div>\n");
      out.write("                            <div class=\"product_img\"><a href=\"#\"><img src=\"images/p3.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                            <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"prod_details_tab\"> <a href=\"#\" class=\"prod_buy\">Add to Cart</a> <a href=\"#\" class=\"prod_details\">Details</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of center content -->\n");
      out.write("                <div class=\"right_content\">\n");
      out.write("\n");
      out.write("                    <div class=\"title_box\">Pesquisar</div>\n");
      out.write("                    <div class=\"border_box\">\n");
      out.write("                   <input type=\"text\" name=\"newsletter\" class=\"newsletter_input\" value=\"keyword\"/>\n");
      out.write("                    <a href=\"#\" class=\"join\">search</a> </div>\n");
      out.write("                        \n");
      out.write("                         </div>\n");
      out.write("                    <div class=\"shopping_cart\">\n");
      out.write("                        <div class=\"title_box\">Shopping cart</div>\n");
      out.write("                        <div class=\"cart_details\"> 3 items <br />\n");
      out.write("                            <span class=\"border_cart\"></span> Total: <span class=\"price\">350$</span> </div>\n");
      out.write("                        <div class=\"cart_icon\"><a href=\"#\"><img src=\"images/shoppingcart.png\" alt=\"\" width=\"35\" height=\"35\" border=\"0\" /></a></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title_box\">What’s new</div>\n");
      out.write("                    <div class=\"border_box\">\n");
      out.write("                        <div class=\"product_title\"><a href=\"#\">Motorola 156 MX-VL</a></div>\n");
      out.write("                        <div class=\"product_img\"><a href=\"#\"><img src=\"images/p2.jpg\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("                        <div class=\"prod_price\"><span class=\"reduce\">350$</span> <span class=\"price\">270$</span></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"title_box\">Manufacturers</div>\n");
      out.write("                    <ul class=\"left_menu\">\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Bosch</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Samsung</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Makita</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">LG</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Fujitsu Siemens</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Motorola</a></li>\n");
      out.write("                        <li class=\"odd\"><a href=\"#\">Phillips</a></li>\n");
      out.write("                        <li class=\"even\"><a href=\"#\">Beko</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"banner_adds\"> <a href=\"#\"><img src=\"images/bann1.jpg\" alt=\"\" border=\"0\" /></a> </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end of right content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end of main content -->\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"left_footer\"> <img src=\"images/footer_logo.png\" alt=\"\" width=\"89\" height=\"42\"/> </div>\n");
      out.write("                <div class=\"center_footer\"> Template name. All Rights Reserved 2008<br />\n");
      out.write("                    <a href=\"http://csscreme.com\"><img src=\"images/csscreme.jpg\" alt=\"csscreme\" title=\"csscreme\" border=\"0\" /></a><br />\n");
      out.write("                    <img src=\"images/payment.gif\" alt=\"\" /> </div>\n");
      out.write("                <div class=\"right_footer\"> <a href=\"#\">home</a> <a href=\"#\">about</a> <a href=\"#\">sitemap</a> <a href=\"#\">rss</a> <a href=\"#\">contact us</a> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end of main_container -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
