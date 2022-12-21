package com.student.model;

import com.student.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

	private int id;
	private String LName;
	private String FName;
	private String course;
	private Long phone;
	private String email;

}
