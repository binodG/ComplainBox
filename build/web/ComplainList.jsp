<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@include file="shared/header.jsp"%>
<c:forEach var="complain" items="${complainList}">
    <H1>${complain.title}</H1>
    <div class="read-more">
        <p>${fn:substring(complain.description,0, 10)}</p>
        <a href="ReadWhole?id=${complain.id}">Read More</a>
    </div>
    
</c:forEach>
