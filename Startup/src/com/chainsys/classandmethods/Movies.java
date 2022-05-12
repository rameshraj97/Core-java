package com.chainsys.classandmethods;

public class Movies {
	private final String Moviesname;
	private String theatrename;
	private String releaseData;
	private int ticketNo;

	public Movies(String movname) 
	{
		this.Moviesname=movname;
	}

	public String getMoviesname() {
		return Moviesname;
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	public String getReleaseData() {
		return releaseData;
	}

	public void setReleaseData(String releaseData) {
		this.releaseData = releaseData;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	
}
