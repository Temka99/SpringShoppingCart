$(function(){
	
	// solving the active menu
	switch(menu){
	case 'About Us Page':
		$('#about').addClass('active');
		break;
	case 'Contact Us Page':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	case 'Home Page':
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}

});