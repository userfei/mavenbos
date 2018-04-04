package org.apache.jsp.easyuidemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo2_005flayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- 先引入 jquery的 js -->\r\n");
      out.write("<script type=\"text/javascript\" \r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<!-- 引入 easyui的js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<!-- 引入国际化 js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<!-- 引入 默认样式 css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\"/>\r\n");
      out.write("<!-- 引入 icon图标 css  -->\r\n");
      out.write("<link rel=\"stylesheet\" \r\n");
      out.write("type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<!-- easyui 标签 data-options 配置属性  -->\r\n");
      out.write("\t<!-- 只有 center 是必须  -->\r\n");
      out.write("\t<div data-options=\"region:'north',title:'北部面板'\" style=\"height:100px;\"></div>\r\n");
      out.write("\t<div data-options=\"region:'south',title:'南部面板'\" style=\"height:100px;\"></div>\r\n");
      out.write("\t<div data-options=\"region:'west',title:'西部面板'\" style=\"width:150px;\">\r\n");
      out.write("\t\t<!-- 折叠面板 -->\r\n");
      out.write("\t\t<!-- fit 属性，使当前 div 占满父容器 -->\r\n");
      out.write("\t\t<div class=\"easyui-accordion\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<!-- 通过 iconCls 设置图标，找 icon.css 中类定义  -->\r\n");
      out.write("\t\t<div data-options=\"title:'base functions', iconCls:'icon-mini-add'\">面板1</div>\r\n");
      out.write("\t\t<div data-options=\"title:'base functions', iconCls:'icon-mini-add'\">面板2</div>\r\n");
      out.write("\t\t<div data-options=\"title:'base functions', iconCls:'icon-mini-add'\">面板3</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center',title:'中部面板'\"></div>\r\n");
      out.write("\t<div data-options=\"region:'east',title:'东部面板'\" style=\"width:150px;\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
