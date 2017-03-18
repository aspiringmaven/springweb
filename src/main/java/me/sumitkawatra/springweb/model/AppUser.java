package me.sumitkawatra.springweb.model;

import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import me.sumitkawatra.validator.IsValidHobby;

public class AppUser {

	private int id;
	@NotNull
	@NotEmpty(message = "{ui.message.error}")
	private String name;
	@NotNull
	@Size(min = 10, max = 100, message = "Bio is must Please add.")
	private String bio;

	private Map<String, String> domain;
	private String selDomain;

	private String gender;

	private boolean bca;
	private boolean mca;
	private boolean phd;

	private String email;

	@IsValidHobby(hobbies="GAMING")
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Map<String, String> getDomain() {
		return domain;
	}

	public void setDomain(Map<String, String> domain) {
		this.domain = domain;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isBca() {
		return bca;
	}

	public void setBca(boolean bca) {
		this.bca = bca;
	}

	public boolean isMca() {
		return mca;
	}

	public void setMca(boolean mca) {
		this.mca = mca;
	}

	public boolean isPhd() {
		return phd;
	}

	public void setPhd(boolean phd) {
		this.phd = phd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSelDomain() {
		return selDomain;
	}

	public void setSelDomain(String selDomain) {
		this.selDomain = selDomain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobby() {
		return hobby;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", name=" + name + ", bio=" + bio + ", domain=" + domain + ", selDomain="
				+ selDomain + ", gender=" + gender + ", bca=" + bca + ", mca=" + mca + ", phd=" + phd + ", email="
				+ email + ", hobby=" + hobby + "]";
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
