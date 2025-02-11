package co.ppg2.controllers;

import co.ppg2.model.Player;
import java.io.*;
import java.util.ArrayList;


public class PlayerDataController {


    private static final String FILE_NAME = "players.dat";
    public static void savePlayers(ArrayList<Player> players) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Player> loadPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            players = (ArrayList<Player>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return players;
    }




}





