package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Staff;
import com.example.Cafateria.Database.User;
import com.example.Cafateria.Repos.StaffRepo;
import com.example.Cafateria.Repos.UserRepo;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class StaffService {


  @Autowired
  private final StaffRepo staffRepository;
  public List<Staff> getAllStaff() {
    return staffRepository.findAll();
  }

  public Staff createStaff(Staff staff) {
    return staffRepository.save(staff);
  }


  public Staff getStaffById(Long id) {
    return staffRepository.findById(id).orElse(null);
  }



  public Staff updateStaff(Long id,Staff staff) {
    Optional<Staff> updateStaff= this.staffRepository.findById(id);
    if (updateStaff.isPresent()){
     updateStaff.get().setStaffId(staff.getStaffId());
      return this.staffRepository.save(staff);
    }
    throw new RuntimeException();
  }

  public void deletStaff(Long id) {
    staffRepository.deleteById(id);
  }
}
