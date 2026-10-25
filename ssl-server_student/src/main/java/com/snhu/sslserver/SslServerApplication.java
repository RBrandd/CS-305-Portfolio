package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslServerApplication {

private static final String DATA =
		"Ricki Brandon - CS305 Project Two Checksum Verification 2026";

public static void main(String[] args) {
	SpringApplication.run(SslServerApplication.class, args);
}

@GetMapping("/hash")
public String getHash() {
	return "Name and Unique Data: " + DATA
			+ "\nSHA-256 Checksum: " + calculateSHA256(DATA);
}

private String calculateSHA256(String data) {
	try {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hashBytes = digest.digest(data.getBytes(StandardCharsets.UTF_8));
		
		StringBuilder hexString = new StringBuilder();
		
		for (byte hashByte : hashBytes) {
			hexString.append(String.format("%02x",  hashByte & 0xff));
		}
		
		return hexString.toString();
	} catch (NoSuchAlgorithmException e) {
		throw new IllegalStateException("SHA-256 algorithm is unavailable.", e);
	}
}

}