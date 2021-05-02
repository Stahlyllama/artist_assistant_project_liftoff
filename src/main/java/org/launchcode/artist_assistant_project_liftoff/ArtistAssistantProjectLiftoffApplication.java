package org.launchcode.artist_assistant_project_liftoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

@SpringBootApplication
public class ArtistAssistantProjectLiftoffApplication {
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name= "users_roles",
			joinColumns = @JoinColumn(
					name = "user_id", referencedColumnName="id"),
			inverseJoinColumns = @JoinColumn (name= "user_id", referencedColumnName = "id"))

	public static void main(String[] args) {
		SpringApplication.run(ArtistAssistantProjectLiftoffApplication.class, args);
	}

}
