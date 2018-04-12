<div class="list-group">

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/${category.id}" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
</div>