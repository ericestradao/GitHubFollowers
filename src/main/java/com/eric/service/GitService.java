package com.eric.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eric.model.User;

@Service
public class GitService {
	
	@Autowired RestTemplate restTemplate;

	
public List<User> getFollowers(String login){
	final String uri = "https://api.github.com/users/"+login+"/followers";
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(uri, User[].class);
    return (List<User>) Arrays.asList(responseEntity.getBody());
	}
}
