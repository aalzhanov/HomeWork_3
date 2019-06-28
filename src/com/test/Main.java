package com.test;

public class Main {

    public static void main(String[] args) {
        String names[] = {"Adilhan ", "Bectur ", "Nurdin "};
        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println(names[i] + "Доброе утро");
                case 1:
                    System.out.println(names[i] + "Добрый день");
                case 2:
                    System.out.println(names[i] + "Добрый вечер");
            }
        }

        
    }
}
