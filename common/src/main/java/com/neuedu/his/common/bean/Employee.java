package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.List;

@Data
public class Employee extends BaseBean {

    private String employeeName;
    private String phone;
    private String gender;
    private Integer age;
    private String employeeType;

    private List<Department> departmentList;
}
