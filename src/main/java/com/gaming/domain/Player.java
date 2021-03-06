package com.gaming.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Players")
public class Player {

	private String name;

	@DynamoDBHashKey
	@DynamoDBAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
