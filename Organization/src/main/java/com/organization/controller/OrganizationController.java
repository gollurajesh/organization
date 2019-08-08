package com.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {

	@GetMapping("getOrganization")
	public String getOrganization() {
		return "getOrganization";
	}
}
