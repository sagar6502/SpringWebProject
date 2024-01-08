<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
 
<fieldset class="mb-3">				
	<form:label path="description">Description</form:label>
	<form:input type="text" path="description" required="required"/>
	<form:errors path="description" cssClass="text-warning"/>
</fieldset>
<fieldset class="mb-3">				
	<form:label path="targetDate">Target Date</form:label>
	<form:input type="text" path="targetDate" required="required"/>
	<form:errors path="targetDate" cssClass="text-warning"/>
</fieldset>
		
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	});
</script>






