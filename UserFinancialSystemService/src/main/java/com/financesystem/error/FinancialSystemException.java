package com.financesystem.error;

import java.util.List;

public class FinancialSystemException extends Exception {

	public FinancialSystemException() {
		super();
	}

	private transient  List<Exception> exceptionList;

	private transient  List<String> errorMessageList;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FinancialSystemException(Exception e) {

	}

	public List<Exception> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Exception> exceptionList) {
		this.exceptionList = exceptionList;
	}

	public List<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(List<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public FinancialSystemException(List<String> exceptionMessageList) {
		errorMessageList = exceptionMessageList;
	}

	public FinancialSystemException(List<Exception> exceptionList, List<String> exceptionMessagelist) {
		errorMessageList = exceptionMessagelist;
		this.exceptionList = exceptionList;
	}

}
