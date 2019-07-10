package com.neuedu.his.global.service;

import com.neuedu.his.common.bean.Employee;
import com.neuedu.his.common.service.BaseService;
import com.neuedu.his.global.dao.EmployeeDao;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseService<Employee,EmployeeDao> {
}
