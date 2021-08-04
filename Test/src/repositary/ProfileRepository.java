package repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import pojo.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Integer>{

}
