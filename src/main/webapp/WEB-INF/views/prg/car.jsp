<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<script type="text/javascript">
$(document).ready(function() {
	alert("hello");
});
</script>
<form:form id="form" method="post" modelAttribute="carForm">	
	<div class="header">
  		<h2>Car Form</h2>
  		<form:label path="name">
  			Name 
 		</form:label>
  		<form:input path="name" />
  		<br/>
  		<form:label path="model">
  			model
 		</form:label>
  		<form:input path="model" />
  		<br/>
  		<form:label path="factoryProvider">
  			Factory Provider
 		</form:label>
  		<form:input path="factoryProvider" />
  		<br/>  		
	</div>
	<input type="submit" value="Submit" />
</form:form>	