package com.capgemini.academy;

import com.capgemini.academy.validate.Validate;

import java.util.Scanner;

/**
 * This file is part of a ViiictorXD project
 * <p>
 * Copyright (c) ViiictorXD
 * https://github.com/viiictorxd
 **/
public class SecondQuestionMain {

    /*
       Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
       Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser
       adicionados para uma string qualquer ser considerada segura.
    */

    public static void main(String[] args) {
        /*
          Instanciando o Scanner e utilizando o recurso "try-with-resource"
          (classes que implementam a classe Closeable conseguem utilizar este recurso e fechar automaticamente após o uso)
         */
        try (final Scanner scanner = new Scanner(System.in)) {
            /*
               Instância da senha escaneada
             */
            final String password = scanner.next();

            /*
              Percorrendo todas as validações
             */
            for (Validate validate : Validate.values()) {
                /*
                  Verificando se é válido, caso verdadeiro, continuaremos a percorrer
                 */
                if (!validate.invalid(password))
                    continue;

                /*
                  A partir deste momento um erro já é previsto na senha da Débora
                 */

                /*
                  Instanciando a variável e substituindo um variável local
                 */
                final String message = validate.getMessage()
                        .replace("{left}", String.valueOf(6 - password.length()));

                /*
                  Enviando mensagem ao console indicando o erro da senha
                 */
                System.out.println(message);
                return;
            }

            System.out.println("Sua senha é segura.");
        }
    }
}
