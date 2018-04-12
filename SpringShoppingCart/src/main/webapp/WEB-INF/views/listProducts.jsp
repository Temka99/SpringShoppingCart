<div class="container">
	<div class="row">

		<!-- To display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
			<!-- Adding a breadcrumb component  -->
			<div class="row">
				<c:if test="${userClickAllProducts  == true}">
					<ol class="breadcrumb">

						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
						<li class="breadcrumb-item active">All Products</li>
					</ol>
				</c:if>


				<c:if test="${userClickCategoryProducts  == true}">
					<ol class="breadcrumb">

						<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
						<li class="breadcrumb-item">Category</li>
						<li class="breadcrumb-item active">${category.name}</li>

						
					</ol>
				</c:if>

			</div>
		</div>


	</div>




</div>