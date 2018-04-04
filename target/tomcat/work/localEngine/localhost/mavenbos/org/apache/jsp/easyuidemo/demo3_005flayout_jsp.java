package org.apache.jsp.easyuidemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo3_005flayout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- zTree js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("<!-- zTreeStyle css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/zTreeStyle.css\"/>\r\n");
      out.write("<!-- 引入 默认样式 css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\"/>\r\n");
      out.write("<!-- 引入 icon图标 css  -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\"/>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 设置树的参数\r\n");
      out.write("\t\tvar setting ={};\r\n");
      out.write("\t\t// 设置树节点数据\r\n");
      out.write("\t\tvar zNodes =[\r\n");
      out.write("\t\t     {\"name\":\"菜单1\"},\r\n");
      out.write("\t\t     {\"name\":\"菜单2\", open:true,\r\n");
      out.write("\t\t    \t children : [\r\n");
      out.write("\t\t    \t      {\"name\":\"菜单11\"},\r\n");
      out.write("\t\t    \t      {\"name\":\"菜单22\"}\r\n");
      out.write("\t\t      ]}\r\n");
      out.write("\t\t];\r\n");
      out.write("\t\t// 初始化树\r\n");
      out.write("\t\t$.fn.zTree.init($(\"#treeDemo\"), setting, zNodes);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 简单树\r\n");
      out.write("\t\t// 设置树的参数\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\t\tenable:true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 设置树节点数据, id 本节点 id, pId 父节点 id\r\n");
      out.write("\t\tvar zNodes =[\r\n");
      out.write("\t\t\t{\"id\":\"1\", \"pId\":\"0\", \"name\":\"菜单1\"},\r\n");
      out.write("\t\t\t{\"id\":\"2\", \"pId\":\"0\", \"name\":\"菜单2\"},\r\n");
      out.write("\t\t\t{\"id\":\"3\", \"pId\":\"1\", \"name\":\"菜单1-1\"},\r\n");
      out.write("\t\t\t{\"id\":\"4\", \"pId\":\"1\", \"name\":\"菜单1-2\"},\r\n");
      out.write("\t\t];\r\n");
      out.write("\t\t// 初始化树\r\n");
      out.write("\t\t$.fn.zTree.init($(\"#simpleTree\"), setting, zNodes);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<!-- easyui 标签 data-options 配置属性  -->\r\n");
      out.write("\t<!-- 只有 center 是必须  -->\r\n");
      out.write("\t<div data-options=\"region:'north',title:'北部面板'\" style=\"height:100px;\">北部</div>\r\n");
      out.write("\t<div data-options=\"region:'south',title:'南部面板'\" style=\"height:100px;\">南部</div>\r\n");
      out.write("\t<div data-options=\"region:'west',title:'西部面板'\" style=\"width:200px;\">\r\n");
      out.write("\t\t<!-- 折叠面板 -->\r\n");
      out.write("\t\t<!-- fit 属性，使当前 div 占满父容器 -->\r\n");
      out.write("\t\t<div class=\"easyui-accordion\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<!-- 通过 iconCls 设置图标，找 icon.css 中类定义  -->\r\n");
      out.write("\t\t\t<div data-options=\"title:'base functions', iconCls:'icon-mini-add'\">\r\n");
      out.write("\t\t\t\t<!-- 标准树 -->\r\n");
      out.write("\t\t\t\t<ul id=\"treeDemo\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div data-options=\"title:'advanced functions', iconCls:'icon-mini-add'\">\r\n");
      out.write("\t\t\t\t<!-- 简单树 -->\r\n");
      out.write("\t\t\t\t<ul id=\"simpleTree\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div data-options=\"title:'management functions', iconCls:'icon-mini-add'\">面板3</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center'\">\r\n");
      out.write("\t\t<!-- 选项卡 -->\r\n");
      out.write("\t\t<!-- fit 属性，使当前 div 占满父容器 -->\r\n");
      out.write("\t\t<div class=\"easyui-tabs\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<!-- 通过 iconCls 设置图标，找 icon.css 中类定义  -->\r\n");
      out.write("\t\t\t<div data-options=\"title:'选项卡1', iconCls:'icon-mini-add'\"></div>\r\n");
      out.write("\t\t\t<div data-options=\"title:'选项卡2', closable:true, iconCls:'icon-mini-add'\">内容2</div>\r\n");
      out.write("\t\t\t<div data-options=\"title:'选项卡3', iconCls:'icon-mini-add'\">内容3</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'east',title:'东部面板'\" style=\"width:200px;\">东部</div>\r\n");
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
