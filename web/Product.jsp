<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
	<tr><td>商品编号</td><td>名称</td><td>价格</td><td>购买</td></tr>
	<c:forEach items="${product}" var="product" varStatus="st">
        <tr>
            <td>${product.productid}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
             
            <form action="addOrderItem" method="post">
             
            数量<input type="text" value="1" name="num">
            <input type="hidden" name="pid" value="${product.productid}">
            <input type="submit" value="购买">
            </form>
            </td>
 
        </tr>
    </c:forEach>
	</table>
</body>
</html>