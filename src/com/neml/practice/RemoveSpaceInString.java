package com.neml.practice;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		
		String withSpace = "we are renegading";
//		String withOutSpce = withSpace.replaceAll("\\s+", "");
//	String withOutSpce = withSpace.replace(" " , "");
		String s = "  abc  def%t";		
		s = s.strip();			
		System.out.println(s);
		

	}

}
