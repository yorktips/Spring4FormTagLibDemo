<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Spring Form TagLib Demo</title>
</head>
<body>
<h1>Spring Form Taglib Demo</h1>

<form:form commandName="formdemo" action="${pageContext.request.contextPath}/demo/form2" >
    <table>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
            <td><form:errors path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
            <td><form:errors path="lastName"/></td>
        </tr>
        <tr>
            <td>Subscribe to newsletter?:</td>
            <%-- Approach 1: Property is of type java.lang.Boolean --%>
            <td><form:checkbox path="receiveNewsletter"/></td>
            <td><form:errors path="receiveNewsletter"/></td>
		</tr>

         <tr>
            <td>Interests:</td>
            <td>
                <%-- Property is of an array or of type java.util.Collection --%>
                <form:checkboxes path="interests" items="${interestList}"/>
            </td>
			<td><form:errors path="interests"/></td>
        </tr>

        <tr>
            <td>Favourite Word:</td>
            <%-- Approach 3: Property is of type java.lang.Object --%>
            <td>
                Magic: <form:checkbox path="favouriteWord" value="Magic"/>
            </td>
            <td><form:errors path="favouriteWord"/></td>
        </tr>
    
		<tr>
		    <td>Sex:</td>
		    <td><form:radiobuttons path="sex" items="${sexOptions}"/></td>
		    <td><form:errors path="sex"/></td>
		</tr>
    
<tr>
    <td>Skills:</td>
    <td><form:select path="skills" items="${skills}"/></td>
    <td><form:errors path="skills"/></td>
</tr>

      
<tr>
    <td>Password:</td>
    <td>
        <form:password path="password" value="^76525bvHGq" showPassword="true"/>
    </td>
    <td><form:errors path="password"/></td>
</tr>      
 
 
<tr>
    <td>Country:</td>
    <td>
        <form:select path="country">
            <form:option value="-" label="--Please Select"/>
            <form:options items="${countryList}" itemValue="countryId" itemLabel="countryName"/>
        </form:select>
    </td>
   <td><form:errors path="country"/></td> 
</tr>
 
   <tr>
    <td>Notes:</td>
    <td><form:textarea path="notes" rows="3" cols="20"/></td>
    <td><form:errors path="notes"/></td>
</tr>     
        <tr>
            <td colspan="3">
                <input type="submit" value="Save Changes"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>