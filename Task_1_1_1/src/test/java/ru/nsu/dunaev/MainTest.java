package ru.nsu.dunaev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void tes(){
        assertEquals(3, Main.sum(1, 2));
    }
}