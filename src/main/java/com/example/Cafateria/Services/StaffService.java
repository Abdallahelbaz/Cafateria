package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Staff;
import com.example.Cafateria.Database.User;
import com.example.Cafateria.Repos.StaffRepo;
import com.example.Cafateria.Repos.UserRepo;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class StaffService {
  private final StaffRepo staffRepository;
  public List<Staff> getAllStaff() {
    return staffRepository.findAll();
  }

  public Staff getStaffById(Long id) {
    return staffRepository.findById(id).orElse(null);
  }

  public User createStaff(Staff staff) {
    return staffRepository.save(staff);
  }

  public Staff updateStaff(Long id,Staff staff) {
    Optional<Staff> updateStaff= this.staffRepository.findById(id);
    if (updateStaff.isPresent()){
      updateStaff.get().setUserName(staff.getUserName());
      return this.staffRepository.save(staff);
    }
    throw new RuntimeException();
  }

  public void deleteUser(Long id) {
    staffRepository.deleteById(id);
  }
}
