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
        /*
          Instanciando o Scanner e utilizando o recurso "try-with-resource"
          (classes que implementam a classe Closeable conseguem utilizar este recurso e fechar automaticamente após o uso)
         */
        try (final Scanner scanner = new Scanner(System.in)) {
            // Instanciando a quantia de degraus da escada
            final int ladderCount = scanner.nextInt();

            // Instanciando um StringBuilder
            final StringBuilder builder = new StringBuilder();
            for (int step = 1; step < ladderCount + 1; step++)
                // Adicionando à String uma repetição de "degraís total - degrau atual" e uma outra repetição do degrau atual
                builder.append(" ".repeat(ladderCount - step))
                        .append("*".repeat(step))
                        .append("\n");

            // Instaciando o resultado e removendo a última letra que seria o quebra linha
            final String result = builder.substring(0, builder.length() - 1);

            // Imprimindo o resultado
            System.out.println(result);
        }
    }
}
