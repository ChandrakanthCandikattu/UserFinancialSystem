package com.financesystem.api;

import org.springframework.stereotype.Service;

import com.chandrakanth.financesystem.dao.impl.DAOImpl;
import com.chandrakanth.financesystem.entity.UserCredentials;
import com.chandrakanth.financesystem.entity.UserCredentialsIdPK;
import com.chandrakanth.financesystem.entity.dto.UserCredentialsDTO;

//@RestController
//@Scope("request")
@Service
public class SubmitAPI {

	public boolean checkForLoginUsers(final UserCredentialsDTO uCTO) {
		UserCredentials uC = new UserCredentials();
		uC.setUserId(new UserCredentialsIdPK(uCTO.getUserId().getUserName(), uCTO.getUserId().getMobileNumber()));
		uC.setPassWord(uCTO.getPassWord());
		DAOImpl daoImpl = new DAOImpl();
		if (daoImpl.persistValues(uC, null)) {
			return true;
		}
		return false;
	}

	public boolean createNewUser() {
		
		return false;
	}
	
}
