package com.neuedu.his.global.web;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.Employee;
import com.neuedu.his.common.web.BaseController;
import com.neuedu.his.global.dao.EmployeeDao;
import com.neuedu.his.global.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/global/employee")
public class EmployeeController extends BaseController<Employee,EmployeeService,EmployeeDao> {


    @Override
    @RequestMapping("list")
    public List<Employee> findList(@RequestBody Employee conditon) {
        return super.findList(conditon);
    }

    @Override
    @RequestMapping("page")
    public PageInfo<Employee> getPage(Employee conditon, Integer pageNum, Integer pageSize) {
        return super.getPage(conditon, pageNum, pageSize);
    }
}
