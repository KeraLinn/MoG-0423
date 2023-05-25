package com.example.mog_0423;

public class playerClass extends createNewGame {
    String playerName;
    int playerAvatar;
    int difficultyLevel;

    public void setPlayerPurse(int playerPurse) {
        this.playerPurse = playerPurse;
    }

    int playerPurse;

    public String getPlayerName() {
        playerName = this.userName;
        return playerName;
    }

    public int getPlayerAvatar() {
        playerAvatar = this.profileImage;
        return playerAvatar;
    }

    public int getDifficultyLevel() {
        difficultyLevel = this.chosenDifficultyLevel;
        return difficultyLevel;
    }

    public int getPlayerPurse() {
        playerPurse = this.playerGold;
        return playerPurse;
    }



}
