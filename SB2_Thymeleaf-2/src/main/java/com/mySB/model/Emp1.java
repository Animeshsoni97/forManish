package com.mySB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Emp")
public class Emp1 {
	@Id
	@Column(name = "empno")
	private Integer empno1;
//an
	@Column(name = "ename")
	private String ename;
}//emp
