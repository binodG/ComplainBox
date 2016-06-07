<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="shared/header.jsp"%>
<jsp:useBean id="dao" class="com.leapfrog.daoimpl.ComplainDaoimpl"/>
<jsp:useBean id="complain" class="com.leapfrog.entity.Complain"/>
 
<c:forEach var="complain" items="${dao.all}">
    <H1>${complain.title}</H1>
    <p>${complain.description}</p>
    <div class="form-group">
        <a href="ReadWhole.jsp?id=${complain.clientId}">Read More</a>
    </div>
</c:forEach>
   

