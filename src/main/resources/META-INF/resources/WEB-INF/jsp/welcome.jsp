<%@ include file='common/header.jspf' %>
	<%@ include file='common/navigation.jspf' %>

	<body>
		<div class="container">
			<h1>Welcome</h1>
			<hr>
			<div>Dear : ${name}</div>
			<div><a href="list-todos"> Manage</a> Your Todos</div>
		</div>
		<%@ include file='common/footer.jspf' %>