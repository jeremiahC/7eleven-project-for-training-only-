package com.up.skill.helpers;

import junit.framework.TestCase;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by nxtlvl on 11/29/2016.
 */
public class HelpersTest extends TestCase{
    @Test
    public void testReturn123(){
        String[] contents = {"hello", "its", "me"};
        assertFalse(Helpers.return123("Hello").equals( "Hello"));
        for(int i=0; i < contents.length; i++){
                    String actual= Helpers.return123(contents[i]);
                    String expected = contents[i] + "123";

                    assertEquals(expected, actual);
        }

    }

    //formula n1 + n2

    @Test
    public void testFibonacci(){
        int[] fibSeq= Helpers.returnInt();

        for(int i = 6 ;  i < fibSeq.length ; i++) {

            double actual = (double) fibSeq[i] / fibSeq[i - 1]; //1.0
            DecimalFormat df = new DecimalFormat("#.#"); //0.0
            String actualRoundOff = df.format(actual);

            double finalActual = Double.parseDouble(actualRoundOff);

            assertEquals(1.6, finalActual);
        }

    }
}
