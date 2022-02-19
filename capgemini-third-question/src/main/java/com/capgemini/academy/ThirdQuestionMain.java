package com.capgemini.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This file is part of a ViiictorXD project
 * <p>
 * Copyright (c) ViiictorXD
 * https://github.com/viiictorxd
 **/
public class ThirdQuestionMain {

    /*
       Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra.
       Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
    */

    public static void main(String[] args) {
        /*
          Instanciando o Scanner e utilizando o recurso "try-with-resource"
          (classes que implementam a classe Closeable conseguem utilizar este recurso e fechar automaticamente após o uso)
         */
        try (final Scanner scanner = new Scanner(System.in)) {
            // Instanciando a próxima linha do leitor
            final String word = scanner.nextLine();

            // Instanciando uma lista para a contagem e ciência das posições dos anagramas
            final List<String> anagrams = new ArrayList<>();

            // Pegando uma letra da palavra e uma posterior e comparando-as.
            for (int i = 0; i < word.length(); i++) {
                for (int x = i + 1; x < word.length(); x++) {
                    if (word.charAt(i) == word.charAt(x) && i < x) {
                        if (word.charAt(i) != word.charAt(i + 1))
                            anagrams.add(i + "," + (i + 1));

                        anagrams.add(i + "," + x);
                    }
                }
            }

            // Imprimindo resultado
            System.out.println("Anagramas: " + anagrams.size() + " (" + anagrams + ")");
        }
    }
}
