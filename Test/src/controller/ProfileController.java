package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pojo.Profile;
import repositary.ProfileRepository;

@RestController
public class ProfileController {

	@Autowired
	ProfileRepository profileRepository;
	//use case -get a profile, update a profile, delete a profile, create a profile
	//Handle exceptions
	//Handle load- use offset, filters etc...
	//Access to resource
	//HATEOAS 
	

	@GetMapping("profile/{id}")
	@ResponseBody
	public Profile getProfileById(@PathVariable("id") Integer profileId) {
		return profileRepository.getById(profileId);
	}

	@GetMapping("profile/{id}")
	@ResponseBody
	public Profile getProfilesByIdAndOffset(@PathVariable("id") Integer profileId,@PathVariable("offSet") Integer offset) {
		return profileRepository.getById(profileId);
	}
	
	@PostMapping("profile/{id}")
	@ResponseBody
	public Profile createProfileById(@PathVariable("id") Integer profileId) {
		Profile profile=new Profile(profileId);
		return profileRepository.save(profile);
	}

	@DeleteMapping("profile/{id}")
	@ResponseBody
	public void deleteProfileById(@PathVariable("id") Integer profileId) {
		profileRepository.deleteById(profileId);
	}

	@PutMapping("profile")
	@ResponseBody
	public Profile updateProfileById(@PathVariable("profile") Profile profile) {
		return profileRepository.save(profile);
	}
	
}
