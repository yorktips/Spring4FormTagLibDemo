spring-form-taglib-demo
===========
Spring MVC -> JSP

This example has been validated with the following environment on MS Windows 7:

1. Eclipse Kepler
   1.1 Spring Tool Suite (STS) 3.4.0.RELEASE - for Kepler
2. Java SDK 1.7.0_51 (separate install)
3. Tomcat 7.0.50 (separate install)
4. Maven 3.0.5 (separate install)
5. All jstl are in reame_jsp-variables-jstl.pdf
   For example:
   (1). If statement:
	    <c:if test="${empty generalLicenseePage.getContent()}">
		  There are no GeneralLicensees
	    </c:if>

   (2). Define a varialbe:
	    <c:url var="prevUrl" value="/listAllGeneralLicensees/${currentIndex - 1}/" />
	    <li><a href="${prevUrl}">&lt;&lt;</a></li>

   (3).	choose statement:
	    <c:choose>
		  <c:when test="${currentIndex == 1}">
			 <li class="disabled"><a href="#">&lt;&lt;</a></li>
		  </c:when>
		  <c:otherwise>
			<li><a href="${firstUrl}">&lt;&lt;</a></li>
		  </c:otherwise>
	    </c:choose>

   (4). foreach statement:
	    <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
		   <c:url var="pageUrl" value="/listAllGeneralLicensees/${i}/" />
		    <c:choose>
			   <c:when test="${i == currentIndex}">
				   <li class="disabled"><a href="${pageUrl}"><c:out value="${i}" /></a></li>
			   </c:when>
			   <c:otherwise>
				   <li><a href="${pageUrl}"><c:out value="${i}" /></a></li>
			   </c:otherwise>
		    </c:choose>
	   </c:forEach>

	