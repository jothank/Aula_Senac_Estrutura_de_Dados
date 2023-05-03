package org.aula.dois;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ExemploPessoa {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(ExemploPessoa.class.getName());

        Pessoa p1 = new Pessoa("Jonathan", 33, "Rua Senac");
        Pessoa p2 = new Pessoa("Igor", 20, "Rua USJ");

        logger.log(Level.INFO, () -> "Pessoa 1: " + p1);
        logger.log(Level.INFO, () -> "Pessoa 2: " + p2);

    }
}
