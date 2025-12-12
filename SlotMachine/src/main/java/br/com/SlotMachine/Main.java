package br.com.SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("*****************************");
        System.out.println("   Bem Vindo ao Java Slots");
        System.out.println("Simbolos: 🍒 🍉 🍊 ☘️ 🍁 💎");
        System.out.println("*****************************");


        while(balance>0){
            System.out.println("Dinheiro disponível: R$"+balance);
            System.out.print("Coloque o valor da aposta: ");
            bet = sc.nextInt();
            sc.nextLine();

            if(bet>balance){
                System.out.println("Dinheiro Insuficiente");
                continue;
            } else if(bet<=0){
                System.out.println("O valor deve ser maior do que 0!");
                continue;
            } else {
                balance-=bet;
            }

            System.out.println("Girado..........");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout>0){
                System.out.println("Você ganhou R$"+payout);
                balance += payout;
            } else {
                System.out.println("Não foi dessa vez!!");
            }

            System.out.println("Quer continuar jogando? (S/N)");
            playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("S")){
                break;
            }
        }

        System.out.println("O jogo terminou! O seu dinheiro final foi: R$"+balance);

        sc.close();
    }

    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍊", "☘️", "🍁", "💎"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("*************");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println("*************");
    }

    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet*3;
                case "🍉" -> bet*4;
                case "🍊" -> bet*4;
                case "☘️" -> bet*3;
                case "🍁" -> bet*5;
                case "💎" -> bet*10;
                default -> 0;
            };
        } else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet*2;
                case "🍉" -> bet*2;
                case "🍊" -> bet*2;
                case "☘️" -> bet*2;
                case "🍁" -> bet*3;
                case "💎" -> bet*5;
                default -> 0;
            };
        } else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet*2;
                case "🍉" -> bet*2;
                case "🍊" -> bet*2;
                case "☘️" -> bet*2;
                case "🍁" -> bet*3;
                case "💎" -> bet*5;
                default -> 0;
            };
        } else if(row[0].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet*2;
                case "🍉" -> bet*2;
                case "🍊" -> bet*2;
                case "☘️" -> bet*2;
                case "🍁" -> bet*3;
                case "💎" -> bet*5;
                default -> 0;
            };
        }

        return 0;
    }
}