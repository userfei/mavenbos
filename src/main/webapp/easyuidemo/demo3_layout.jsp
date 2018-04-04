<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 先引入 jquery的 js -->
<script type="text/javascript" 
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js">
</script>
<!-- 引入 easyui的js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<!-- 引入国际化 js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<!-- zTree js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"></script>
<!-- zTreeStyle css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css"/>
<!-- 引入 默认样式 css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css"/>
<!-- 引入 icon图标 css  -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css"/>
<SCRIPT type="text/javascript">
	$(function(){
		// 设置树的参数
		var setting ={};
		// 设置树节点数据
		var zNodes =[
		     {"name":"菜单1"},
		     {"name":"菜单2", open:true,
		    	 children : [
		    	      {"name":"菜单11"},
		    	      {"name":"菜单22"}
		      ]}
		];
		// 初始化树
		$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		
		// 简单树
		// 设置树的参数
		var setting = {
			data:{
				simpleData : {
					enable:true
				}
			}
		};
		
		// 设置树节点数据, id 本节点 id, pId 父节点 id
		var zNodes =[
			{"id":"1", "pId":"0", "name":"菜单1"},
			{"id":"2", "pId":"0", "name":"菜单2"},
			{"id":"3", "pId":"1", "name":"菜单1-1"},
			{"id":"4", "pId":"1", "name":"菜单1-2"},
		];
		// 初始化树
		$.fn.zTree.init($("#simpleTree"), setting, zNodes);
	});
	
</SCRIPT>
</head>
<body class="easyui-layout">
	<!-- easyui 标签 data-options 配置属性  -->
	<!-- 只有 center 是必须  -->
	<div data-options="region:'north',title:'北部面板'" style="height:100px;">北部</div>
	<div data-options="region:'south',title:'南部面板'" style="height:100px;">南部</div>
	<div data-options="region:'west',title:'西部面板'" style="width:200px;">
		<!-- 折叠面板 -->
		<!-- fit 属性，使当前 div 占满父容器 -->
		<div class="easyui-accordion" data-options="fit:true">
			<!-- 通过 iconCls 设置图标，找 icon.css 中类定义  -->
			<div data-options="title:'base functions', iconCls:'icon-mini-add'">
				<!-- 标准树 -->
				<ul id="treeDemo" class="ztree"></ul>
			</div>
			<div data-options="title:'advanced functions', iconCls:'icon-mini-add'">
				<!-- 简单树 -->
				<ul id="simpleTree" class="ztree"></ul>
			</div>
			<div data-options="title:'management functions', iconCls:'icon-mini-add'">面板3</div>
		</div>
	</div>
	<div data-options="region:'center'">
		<!-- 选项卡 -->
		<!-- fit 属性，使当前 div 占满父容器 -->
		<div class="easyui-tabs" data-options="fit:true">
			<!-- 通过 iconCls 设置图标，找 icon.css 中类定义  -->
			<div data-options="title:'选项卡1', iconCls:'icon-mini-add'"></div>
			<div data-options="title:'选项卡2', closable:true, iconCls:'icon-mini-add'">内容2</div>
			<div data-options="title:'选项卡3', iconCls:'icon-mini-add'">内容3</div>
		</div>
	</div>
	<div data-options="region:'east',title:'东部面板'" style="width:200px;">东部</div>
</body>
</html>