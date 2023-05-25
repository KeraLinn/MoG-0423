package com.example.mog_0423;

public class playerClass extends createNewGame {

    String playerName;
    int playerAvatar;
    int difficultyLevel;
    Commodity[] userInventory;
    int numStartItems;
    int winParameter;

    public void setWinParameter(int winParameter) {
        this.winParameter = winParameter;
    }



    public void setNumStartItems(int numStartItems) {
        this.numStartItems = numStartItems;
    }



    public Commodity[] getUserInventory() {
        return userInventory;
    }

    public void setUserInventory(Commodity[] userInventory) {
        this.userInventory = userInventory;
    }



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

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAvatar(int playerAvatar) {
        this.playerAvatar = playerAvatar;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }


}
