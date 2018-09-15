/**
 * 
 */
$(document).ready(()=>{
	$("#frm1").validate({
        rules:{
            "userId.userName":{
            	required : true
            },
            "passWord":{
            	required : true
            }
        },
        messages: {
        	 "userId.userName":{
        		 required : "User name cannot be empty"
        	 },
        	 "passWord":{
             	required : "Password cannot be empty"
             }
        },
       errorElement : "span",
       errorPlacement : (error, element)=>{
    	   						if(element.attr("name") == "userId.userName"){
									   $("#err1").html(error);
    	   						}
    	   						else{
									   $("#err2").html(error);
    	   						};
       						},
       submitHandler: (form)=>{
    	   var tbl = $("#frm1").first();
    	   var uName = tbl.first().val();
    	   var pass  =  tb1.last().val();
    	   alert(uName);
    	   $.ajax({
    		   
    	   })
    	   /*$form.submit();*/
       }
    });
	
});
