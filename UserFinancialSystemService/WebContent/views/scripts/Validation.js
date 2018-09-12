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
             	required : "password cannot be empty"
             }
        }
    });
});
