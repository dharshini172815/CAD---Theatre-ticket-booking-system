package com.cinema_paradise.repository.dto;

public class Theatre {
	private String theatreId;
    private String name;

    public Theatre(String theatreId, String name) {
        this.theatreId = theatreId;
        this.name = name;
    }

    public String getTheatreId() { return theatreId; }
    public String getName() { return name; }
}
