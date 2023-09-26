package com.eclature.Inheritence;

public class TestCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClsTest s = new SuperClsTest();
		s.setNo(17);
		System.out.println(s.getNo());
		SubCls subCls = new SubCls();
		
		System.out.println(subCls.getNo());
		
		subCls.gett();
	
		
	}

}
