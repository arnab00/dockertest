package com.arn.dockertest.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_XML_VALUE })
	public String success() {
		return "<Root>Ok</Root>";
	}

}
