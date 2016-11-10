package com.gaming.domain;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Games")
public class Game {

	private String id;
	private String tournamentName;
	private List<String> homePlayers;
	private List<String> awayPlayers;
	private Integer homeGoals;
	private Integer awayGoals;

	public Game() {
		super();
	}

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute
	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	@DynamoDBAttribute
	public List<String> getHomePlayers() {
		return homePlayers;
	}

	public void setHomePlayers(List<String> homePlayers) {
		this.homePlayers = homePlayers;
	}

	@DynamoDBAttribute
	public List<String> getAwayPlayers() {
		return awayPlayers;
	}

	public void setAwayPlayers(List<String> awayPlayers) {
		this.awayPlayers = awayPlayers;
	}

	@DynamoDBAttribute
	public Integer getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(Integer homeGoals) {
		this.homeGoals = homeGoals;
	}

	@DynamoDBAttribute
	public Integer getAwayGoals() {
		return awayGoals;
	}

	public void setAwayGoals(Integer awayGoals) {
		this.awayGoals = awayGoals;
	}

}