package com.omkarkulkarni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private String stdCourse;
	private Double studentFeeDiscount;
	private Double studentFeeGST;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	public Double getStudentFeeDiscount() {
		return studentFeeDiscount;
	}
	public void setStudentFeeDiscount(Double studentFeeDiscount) {
		this.studentFeeDiscount = studentFeeDiscount;
	}
	public Double getStudentFeeGST() {
		return studentFeeGST;
	}
	public void setStudentFeeGST(Double studentFeeGST) {
		this.studentFeeGST = studentFeeGST;
	}
	
	
	
}
