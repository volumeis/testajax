<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ page import="com.model2.mvc.service.domain.Purchase" %>
<%
	Purchase vo = (Purchase)request.getAttribute("vo");
%> --%>
<html>
<head>
</head>

<body>

������ ���� ���Ű� �Ǿ����ϴ�.

<table border=1>
	<tr>
		<td>��ǰ��ȣ</td>
<%-- 		<td><%=vo.getPurchaseProd().getProdNo()%></td> --%>
		<td>${purchase.purchaseProd.prodNo}</td>
		<td></td>
	</tr>
	<tr>
		<td>�����ھ��̵�</td>
<%-- 		<td><%=vo.getBuyer().getUserId()%></td> --%>
		<td>${purchase.buyer.userId}</td>
		<td></td>
	</tr>
	<tr>
		<td>���Ź��</td>
		<td>
		<c:if test="${purchase.paymentOption == '1'}">
			���ݱ���
		</c:if>
		<c:if test="${purchase.paymentOption == '2'}">
			�ſ뱸��
		</c:if>
		<%-- <%if(vo.getPaymentOption().equals("1")) {%>
			���ݱ���
		<%} else {%>
			�ſ뱸��
		<%} %> --%>
		</td>
		<td></td>
	</tr>
	<tr>
		<td>�������̸�</td>
<%-- 		<td><%=vo.getReceiverName()%></td> --%>
		<td>${purchase.receiverName}</td>
		<td></td>
	</tr>
	<tr>
		<td>�����ڿ���ó</td>
<%-- 		<td><%=vo.getReceiverPhone()%></td> --%>
		<td>${purchase.receiverPhone}</td>
		<td></td>
	</tr>
	<tr>
		<td>�������ּ�</td>
<%-- 		<td><%=vo.getDivyAddr()%></td> --%>
		<td>${purchase.divyAddr}</td>
		<td></td>
	</tr>
		<tr>
		<td>���ſ�û����</td>
<%-- 		<td><%=vo.getDivyRequest()%></td> --%>
		<td>${purchase.divyRequest}</td>
		<td></td>
	</tr>
	<tr>
		<td>����������</td>
<%-- 		<td><%=vo.getDivyDate()%></td> --%>
		<td>${purchase.divyDate}</td>
		<td></td>
	</tr>
</table>

</body>
</html>