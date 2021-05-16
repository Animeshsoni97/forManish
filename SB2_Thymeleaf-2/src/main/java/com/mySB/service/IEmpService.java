package com.mySB.service;

import java.util.List;

import com.mySB.model.Emp1;

public interface IEmpService {

	public List<Emp1> getEmp();
	
	public Emp1 insertEmp(Emp1 e);
public void deleteEmp(Integer e);

Emp1 getEmpByID(Integer empno1);
}
