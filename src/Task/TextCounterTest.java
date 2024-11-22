package Task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TextCounterTest {

    @Test
    public void testCountWithSingleCharacter(){

        //Testar räkning med enstaka tecken
        TextCounter counter = new TextCounter();

        counter.count("A");

        assertEquals(1, counter.getNumberOfRow());
        assertEquals(1, counter.getNumberOfChar());
    }

    @Test
    public void testerCountChars(){
        //Testar att räknaren korrekt räknar antalet tecken
        TextCounter counter = new TextCounter();

        counter.count("hello"); //5 tecken
        counter.count("world"); //5 tecken

        assertEquals(10, counter.getNumberOfChar());

    }


    @Test
    public void testCountRows(){

        //testar att räknaren korrekt räknar antalet rader
        TextCounter counter = new TextCounter();

        counter.count("Hello, world!");
        counter.count("This is a second line");

        assertEquals(2, counter.getNumberOfRow());

    }




}
