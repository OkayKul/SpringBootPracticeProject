package com.omkarkulkarni.service.util;

import org.springframework.stereotype.Component;

import com.omkarkulkarni.model.Student;


public class StudentUtil {

	 public static void calculateGST(Student student) {
		// TODO Auto-generated method stub
		double fee = student.getStudentFee();
		double discount = fee * 10/100;
		double gst = fee * 12/100;
		
		student.setStudentFeeDiscount(discount);
		student.setStudentFeeGST(gst);
	}

}
