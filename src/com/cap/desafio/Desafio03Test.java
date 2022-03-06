package com.cap.desafio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Desafio03Test {

    @Test
    void encriptarTexto() {
        Desafio03 desafio03 = new Desafio03();
        assertEquals("taoa eum nmd hbi",desafio03.encriptarTexto("tenha um bom dia"));
        assertEquals("omd luo an",desafio03.encriptarTexto("ola mundo"));
    }
}