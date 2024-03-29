<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 목록</h1>
		</div>
	</div>
	<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div class="container">
	<div class="row">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>

				<div class="col-md-4">
				<img src="c:/upload/<%=product.getFilename()%>" style="width: 80%">
				</div>
				
				<div class="col-md-4">
			    <h3>[<%=product.getCategory() %>]<%=product.getPname() %></h3>
				<p><%=product.getDescription() %>
				<p><%=product.getAuthor()%> | <%=product.getManufacturer() %> | <%=product.getUnitPrice() %>원
				</div>
				
				<div class="col-md-4">
				<p><a href="./product.jsp?id=<%=product.getProductId() %>"class="btn btn-secondary" role="button">상세정보 &raquo;</a>
				</div>
			
			<%
				}
			%>
			
		</div>
		
			<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
