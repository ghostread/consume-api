package com.hibesoft;

public class TeamServer {
    private Long id;
    private String name;
    private String key;
    private boolean active;
    private String teamID;
    private String school;
    private String apRank;
    private String wins;
    private String losses;
    private String conferenceWins;
    private String conferenceLosses;
    private String globalTeamID;
    private String conferenceID;
    private String conference;
    private String teamLogoUrl;
    private String shortDisplayName;
    private String stadiumID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getApRank() {
        return apRank;
    }

    public void setApRank(String apRank) {
        this.apRank = apRank;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getConferenceWins() {
        return conferenceWins;
    }

    public void setConferenceWins(String conferenceWins) {
        this.conferenceWins = conferenceWins;
    }

    public String getConferenceLosses() {
        return conferenceLosses;
    }

    public void setConferenceLosses(String conferenceLosses) {
        this.conferenceLosses = conferenceLosses;
    }

    public String getGlobalTeamID() {
        return globalTeamID;
    }

    public void setGlobalTeamID(String globalTeamID) {
        this.globalTeamID = globalTeamID;
    }

    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getTeamLogoUrl() {
        return teamLogoUrl;
    }

    public void setTeamLogoUrl(String teamLogoUrl) {
        this.teamLogoUrl = teamLogoUrl;
    }

    public String getShortDisplayName() {
        return shortDisplayName;
    }

    public void setShortDisplayName(String shortDisplayName) {
        this.shortDisplayName = shortDisplayName;
    }

    public String getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(String stadiumID) {
        this.stadiumID = stadiumID;
    }

    @Override
    public String toString() {

        return "\n{\n" +
                " id :" + id + "\n"+
                " name :" + name + "\n" +
                " key :" + key + "\n" +
                " active :" + active +"\n"+
                " teamID :" + teamID + "\n" +
                " school :" + school + "\n" +
                " apRank :" + apRank + "\n" +
                " wins :" + wins + "\n" +
                " losses :" + losses + "\n" +
                " conferenceWins :" + conferenceWins + "\n" +
                " conferenceLosses :" + conferenceLosses + "\n" +
                " globalTeamID :" + globalTeamID + "\n" +
                " conferenceID :" + conferenceID + "\n" +
                " conference :" + conference + "\n" +
                " teamLogoUrl :" + teamLogoUrl + "\n" +
                " shortDisplayName :" + shortDisplayName + "\n" +
                " stadiumID :" + stadiumID + "\n}";
    }
}
