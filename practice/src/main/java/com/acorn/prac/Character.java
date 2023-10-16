package com.acorn.prac;

public class Character {

	String id;
	String rev;
	String job;
	String pos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRev() {
		return rev;
	}
	public void setRev(String rev) {
		this.rev = rev;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	@Override
	public String toString() {
		return "characterDTO [id=" + id + ", rev=" + rev + ", job=" + job + ", pos=" + pos + "]";
	}
	public Character(String id, String rev, String job, String pos) {
		super();
		this.id = id;
		this.rev = rev;
		this.job = job;
		this.pos = pos;
	}
	public Character() {
		// TODO Auto-generated constructor stub
	}
}
