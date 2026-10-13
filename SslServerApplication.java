package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

	@GetMapping(value = "/hash", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getHash() throws NoSuchAlgorithmException {

		String name = "Matthew Delphia";
		String data = "Artemis Financial Secure Transfer 2026-09-21";

		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		byte[] hashBytes = messageDigest.digest(data.getBytes(StandardCharsets.UTF_8));

		StringBuilder checksum = new StringBuilder();

		for (byte b : hashBytes) {
			checksum.append(String.format("%02x", b));
		}

		return "Name: " + name
				+ "\nData: " + data
				+ "\nSHA-256 Checksum: " + checksum;
	}
}