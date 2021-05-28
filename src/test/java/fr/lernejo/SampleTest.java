package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample sample = new Sample();

    @Test
    void operation_add() {
        assertEquals(10, sample.op(Sample.Operation.ADD, 4, 6));
    }
    @Test
    void operation_mult() {
        assertEquals(24, sample.op(Sample.Operation.MULT, 4, 6));
    }
    @Test
    void facto_negative() {
        assertThrows(IllegalArgumentException.class, () -> {sample.fact(-1);});
    }
    @Test
    void facto() {
        assertEquals(120, sample.fact(5));
    }
}
