$(function(){
	
	// solvint the active menu
	switch(menu){
	case 'About Us Page':
		$('#about').addClass('active');
		break;
	case 'Contact Us Page':
		$('#contact').addClass('active');
		break;
		
	case 'Home Page':
		$('#home').addClass('active');
		break;
	}

});