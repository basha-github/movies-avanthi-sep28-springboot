package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {
	
	@Id
	private String title;
	private String runtime;
	private String year;
	private String poster;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(String title, String runTime, String year, String poster) {
		super();
		this.title = title;
		this.runtime = runTime;
		this.year = year;
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	@Override
	public String toString() {
		return "Movies [title=" + title + ", runTime=" + runtime + ", year=" + year + ", poster=" + poster + "]";
	}
	
	
	
	

}
