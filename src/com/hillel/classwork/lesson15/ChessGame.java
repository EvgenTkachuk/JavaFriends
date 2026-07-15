package com.hillel.classwork.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<ChessItem> chessItems = new ArrayList<>();

        String input;
        while (true) {
            System.out.println("Input ChessItem name: ");
            input = READER.readLine();

            if (input.equals("quit")) {
                break;
            }
            ChessItem item = createChessItem(input);

            if (item != null) {
                chessItems.add(item);
                System.out.println("Create chess item: " + input);
            } else {
                System.out.println("Unknown item " + input);
            }
        }
        System.out.println("Added " + chessItems.size() + " chess items");
        drawChessItems(chessItems);
        Drawable chessBoard = new ChessBoard();
        chessBoard.draw();
    }

    public static ChessItem createChessItem(String input) throws IOException {
        switch (input) {
            case "Pawn":
                return new Pawn();
            case "Queen":
                return new Queen();
            case "King":
                return new King();
            default:
                return null;
        }
    }

    private static void draw(Drawable drawable) {
        if (drawable instanceof Cloneable) {
            System.out.println("It`s Cloneable!");
        }
        drawable.draw();
    }

    private static void drawChessItems(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {
            chessItem.draw();
        }
    }
}
