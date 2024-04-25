package dz.lab8.lab8;

import dz.lab8.lab8.model.Wilaya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Lab8Application implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate
				.query(
					"SELECT * FROM wilaya",
					(res, rowNum) -> new Wilaya(
											res.getInt("id"),
											res.getBoolean("actif"),
											res.getInt("compte_creation"),
											res.getInt("compte_maj"),
											res.getDate("date_creation"),
											res.getDate("date_maj"),
											res.getString("nom_arabe"),
											res.getString("nom_latin"),
											res.getString("nom_tamazight")
									)
				).forEach(System.out::println);
	}
}
