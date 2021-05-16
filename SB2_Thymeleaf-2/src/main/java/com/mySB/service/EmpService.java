package com.mySB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySB.model.Emp1;
import com.mySB.repo.MyRepo;
@Service
public class EmpService implements IEmpService {
	@Autowired
	private MyRepo mr;

	@Override
	public List<Emp1> getEmp() {
		List<Emp1> e=(List<Emp1>) mr.findAll();
		return e;
	}
	@Override 
	public Emp1 insertEmp(Emp1 e) {
		Emp1 e1=mr.save(e);
		return e1;
	}
	@Override
	public void deleteEmp(Integer id) {
            mr.deleteById(id);
	}//delete

	 @Override
	public Emp1 getEmpByID(Integer empno1) {
		 Emp1 e = null;
		 Optional<Emp1> oe =  mr.findById(empno1);
		if(oe.isPresent()) {
			 e = oe.get();
		} 
		else throw new IllegalArgumentException("id not found");
		 return e;
	}
}
