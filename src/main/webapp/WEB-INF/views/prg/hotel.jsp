<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form id="form" method="post" modelAttribute="hotelForm">
	<div class="header">
  		<h2>Form</h2>
  		<form:label path="name">
  			Name 
 		</form:label>
  		<form:input path="name" />
  		<br/>
  		<form:label path="address">
  			address
 		</form:label>
  		<form:input path="address" />
  		<br/>  		
  		<form:label path="Rate">
  			Rate
 		</form:label>
  		<form:input path="rate" />
  		<br/>  		
	</div>
	<input type="submit" value="Submit" />	
</form:form>	