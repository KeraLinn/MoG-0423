package com.example.mog_0423;

public class playerClass extends createNewGame {


    playerClass thePlayer;
    String playerName;
    int playerAvatar = 0;
    int difficultyLevel = 0;
    Commodity[] userInventory;
    int numStartItems;
    private static int playerPurse = 500;
    String winParameter;

    /*public playerClass(String playerName, int playerAvatar, int playerPurse, int difficultyLevel) {
        this.playerName = playerName;
        this.playerAvatar = playerAvatar;
        this.playerPurse = playerPurse;
        this.difficultyLevel = difficultyLevel;
    }*/

    public String getWinParameter() {
        return winParameter;
    }

    public void setWinParameter(String winParameter) {
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
        playerClass.playerPurse = playerPurse;
    }

    public String getPlayerName() {

        return playerName;
    }

    public int getPlayerAvatar() {

        return playerAvatar;
    }

    public int getDifficultyLevel() {

        return difficultyLevel;
    }

    public int getPlayerPurse() {
        return playerPurse;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAvatar(int playerAvatar) {
        switch(playerAvatar){
            case 1:
                this.playerAvatar = R.drawable.icons8_butterfly_100;
                break;
            case 2:
                this.playerAvatar = R.drawable.icons8_cat_100;
                break;
            case 3:
                this.playerAvatar = R.drawable.icons8_elephant_100;
                break;
            case 4:
                this.playerAvatar = R.drawable.icons8_hummingbird_100;
                break;
            case 5:
                this.playerAvatar = R.drawable.icons8_german_shepherd_100;
                break;
            case 6:
                this.playerAvatar = R.drawable.icons8_crab_100;
                break;
        }
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }


}
