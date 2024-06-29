package com.example.Cafateria.Controllers;

import com.example.Cafateria.Database.Staff;
import com.example.Cafateria.Database.User;
import com.example.Cafateria.Services.StaffService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users/staff")
@AllArgsConstructor
public class StaffController {

  @Autowired
  private final StaffService staffService;

  @GetMapping("/getAllStaff")
  public List<Staff> getAllStaff() {
    return staffService.getAllStaff();
  }

  @GetMapping(value = "/{id}")
  public User getUserById(@PathVariable Long id) {
    return staffService.getStaffById(id);
  }

  @PostMapping("/create")
  public User createStaff(@RequestBody Staff staff) {
    return staffService.createStaff(staff);
  }

  @PutMapping("/{id}")
  public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staff){
    staff.setUserId(id); // Ensure the ID is set for update operation
    return staffService.updateStaff(id,staff);
  }


  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable Long id) {
    staffService.deletStaff(id);
  }
}