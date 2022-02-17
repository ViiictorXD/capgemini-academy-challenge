package com.capgemini.academy;

import java.util.Scanner;

/**
 * This file is part of a ViiictorXD project
 * <p>
 * Copyright (c) ViiictorXD
 * https://github.com/viiictorxd
 **/
public class FirstQuestionMain {

    /*
       Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
       A base e altura da escada devem ser iguais ao valor de n.
       A última linha não deve conter nenhum espaço.
    */

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            final int ladderCount = scanner.nextInt();

            final StringBuilder builder = new StringBuilder();
            for (int step = 1; step < ladderCount + 1; step++)
                builder.append(" ".repeat(ladderCount - step))
                        .append("*".repeat(step))
                        .append("\n");

            final String result = builder.substring(0, builder.length() - 1);
            System.out.println(result);
        }
    }
}
