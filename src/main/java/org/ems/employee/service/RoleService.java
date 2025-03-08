package org.ems.employee.service;

import java.util.List;

import org.ems.employee.model.Role;

public interface RoleService {
  void createRole(String roleName,String  roleDesc);
  List<Role> getAllRole();
  void assignRoleToEmployee(Long employeeId,Long roleId);
}
