package com.eclature.exceptionHandling;

public class TestException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	private int code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public TestException(String msg, int code) {
		super();
		this.msg = msg;
		this.code = code;
	}
	public TestException(String msg) {
		super();
		this.msg = msg;	}
	@Override
	public String toString() {
		return "TestException [msg=" + msg + ", code=" + code + "]";
	}
	
	 

}
