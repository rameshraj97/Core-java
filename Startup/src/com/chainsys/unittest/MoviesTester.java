package com.chainsys.unittest;

import com.chainsys.classandmethods.Movies;

public class MoviesTester
{
	public static void testMovie()
	{
		Movies firstMovie = new Movies("RRR");
		firstMovie.setReleaseData("26 March 2022");
		firstMovie.setTheatrename("Skywalk");
		firstMovie.setTicketNo(12);
		System.out.println(firstMovie.getMoviesname());
		System.out.println(firstMovie.getReleaseData());
		System.out.println(firstMovie.getTheatrename());
		System.out.println(firstMovie.getTicketNo());
	}
}
