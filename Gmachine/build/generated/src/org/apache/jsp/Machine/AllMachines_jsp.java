package org.apache.jsp.Machine;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllMachines_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("   \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <nav class='navbar navbar-expand-lg navbar-light' id='nav' style='background:transparent; box-shadow: none !important; background-color: black'>\n");
      out.write("        <a style='margin-left: 5%' class='navbar-brand'><img style='width: 20%; ' class=\"rounded-circle\" src='images/mach.jpg' alt='Logo'></a>\n");
      out.write("        <button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>\n");
      out.write("            <span style='color: white' class='navbar-toggler-icon'></span>\n");
      out.write("        </button>\n");
      out.write("        <div style='margin-left: 40%;' class='collapse navbar-collapse'  id='navbarNav'>\n");
      out.write("            <ul class='navbar-nav'>\n");
      out.write("                <li class='nav-item' >\n");
      out.write("                    <a class='nav-link' style='color: white; font-family: 'Poppins Light'; margin-left: -5%;' href='#'>Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class='nav-item'>\n");
      out.write("                    <a class='nav-link' style='color: white; font-family: 'Poppins Light'; margin-left: -5%;' href='AllMarques'>Marque</a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <li class='nav-item'>\n");
      out.write("                    <a class='nav-link' style='color: white; font-family: 'Poppins Light'; margin-left: -5%;' href='AllMachines'>Machines</a>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                 <li class='nav-item'>\n");
      out.write("                    <a class='nav-link' style='color: white; font-family: 'Poppins Light'; margin-left: -5%;' href='statistiques'>statistiques</a>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <button id='btn' type='button' class='btn' style='margin-left: 2%; border: 2px solid #FE6825; border-radius: 50px; background-color: #FE6825;'><a style='color: white; padding: 10px 20px 10px 20px; font-family: 'Poppins Medium'; text-decoration: none;' href=\"Logout\">logout</a> </button>\n");
      out.write("        </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("\n");
      out.write("<section style=\"background-image:url('images/ma.jpg');background-repeat: no-repeat;background-size: cover;max-width: 100%;height: 800px; margin-top: -2px;\">\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"reference\" placeholder=\"Reference\"  style=\"margin-top: 3%;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"dateAchat\" style=\"margin-top: 3%;\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <div style=\"text-align: center; margin-top: 5%;\">\n");
      out.write("            <h3 style=\"color: black; font-family: 'Poppins Medium'; font-weight: bold;\">Machines</h3>\n");
      out.write("            <h1><a href=\"AddM\" style=\"color: #FE6825;text-decoration: none\">+</a></h1>\n");
      out.write("        </div>\n");
      out.write("        <center>\n");
      out.write("            <div style=\"border: 2px solid #FE6825;  border-width: 5px 30px 5px; width: 5%\"></div>\n");
      out.write("        </center>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row row-cols-1 row-cols-md-2\" style=\"margin-top: 6%;\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v5.14.0/js/all.js\" data-auto-replace-svg=\"nest\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("Truck");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllMachines }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col mb-4\">\n");
          out.write("                    <div class=\"card\">\n");
          out.write("                        <img src=\"images/mach.jpg\" class=\"card-img-top\"  style=\"height: 300px\"/>\n");
          out.write("                        <div class=\"card-body\">\n");
          out.write("                            <h5 class=\"card-title\" style=\"color: #fe6825;\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h5>\n");
          out.write("                           \n");
          out.write("                            <h6 class=\"card-title\" style=\"color: rgb(169 99 27);\"><span style=\"color: black;\">Price :</span>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\n");
          out.write("                            <h6 class=\"card-title\" style=\"color: rgb(169 99 27);;\"><span style=\"color: black;\">DateAchat :</span> ");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</h6>\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                                <a  href=\"EditMachines?idm=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&ref=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.reference }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&pr=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.prix }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&dat=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.dateAchat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn\" style=\"color: white; background-color: \t#5f4c4c;\">Edit</a>\n");
          out.write("                                                   <a onclick=\"return confirm('Etes vous sure ?')\" href=\"DeleteMachines?idm=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn\" style=\"color: white; background-color: \t#5f4c4c;\">Delete</a>\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.reference}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.prix }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Truck.dateAchat }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
