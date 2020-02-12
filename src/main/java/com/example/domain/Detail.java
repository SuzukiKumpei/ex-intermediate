package com.example.domain;

/**
 * 野球チーム詳細情報を表すドメイン.
 * 
 * @author suzukikunpei
 *
 */
public class Detail {

	/** 野球チームID */
	private Integer id;
	/** リーグ名 */
	private String league_name;
	/** チーム名 */
	private String team_name;
	/** 本拠地 */
	private String headquarters;
	/** 発足日 */
	private String inauguration;
	/** チーム変遷 */
	private String history;

	@Override
	public String toString() {
		return "Detail [id=" + id + ", league_name=" + league_name + ", team_name=" + team_name + ", headquarters="
				+ headquarters + ", inauguration=" + inauguration + ", history=" + history + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
