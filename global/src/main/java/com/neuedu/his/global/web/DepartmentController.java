package com.neuedu.his.global.web;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.Department;
import com.neuedu.his.common.web.BaseController;
import com.neuedu.his.global.dao.DepartmentDao;
import com.neuedu.his.global.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/global/department")
public class DepartmentController extends BaseController<Department,DepartmentService,DepartmentDao> {


    @Override
    @GetMapping("{id}")
    public Department findById(@PathVariable("id") String id) {
        return super.findById(id);
    }

    @PostMapping("page")
    @Override
    public PageInfo<Department> getPage(Department conditon, Integer pageNum, Integer pageSize) {
        return super.getPage(conditon, pageNum, pageSize);
    }
}
