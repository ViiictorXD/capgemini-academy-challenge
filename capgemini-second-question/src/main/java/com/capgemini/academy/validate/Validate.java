package com.capgemini.academy.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This file is part of a ViiictorXD project
 * <p>
 * Copyright (c) ViiictorXD
 * https://github.com/viiictorxd
 **/
public enum Validate {

    NUMBER("[0-9]", "Sua senha precisa de no mínimo 1 (um) número.", 0),
    UPPERCASE("[A-Z]", "Sua senha precisa de no mínimo 1 (uma) letra em maiúsculo.", 0),
    LOWERCASE("[a-z]", "Sua senha precisa de no mínimo 1 (uma) letra em minúsculo.", 0),
    CHARACTER("[!@#$%^&*()-+]", "Sua senha precisa de 1 (um) caractere especial. (Disponíveis: !@#$%^&*()-+)", 0),
    STR_COUNT("Sua senha precisa de no mínimo 6 (seis) caracteres no total. Faltam {left} letra(s).", 6);

    private final String regex;
    private final String message;

    private final int count;

    Validate(String message, int min) {
        this("", message, min);
    }

    Validate(String regex, String message, int count) {
        this.regex = regex;
        this.message = message;
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public boolean invalid(String subject) {
        /*
          Instanciando variáveis uteís para a identificação de certos RegEx em uma String
         */
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(subject);

        /*
          Instanciando uma variável Inteiro começando do 0
         */
        int findCount = 0;

        /*
          Percorrendo todos os RegEx encontrado nessa String
         */
        while (matcher.find())
            /*
              Encontrado, iremos aumentar um na variável Inteiro "findCount"
             */
            findCount++;

            /*
              Validação final, verificando se o total encontrado é menor ou igual a respectiva contagem padrão configurar
              no escopo do código
             */
        return findCount <= count;
    }
}
