package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutYali() throws  Exception {
        assertThat(queryProcessor.process("yali"), containsString("yali"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutNumber() throws Exception {
        assertThat(queryProcessor.process("68514740: which of the following numbers is the largest: 431, 69, 38, 946"), containsString("946"));
    }
    @Test // 68514740: what is 6 multiplied by 5
    public void knowsAboutNumberMul() throws Exception {
        assertThat(queryProcessor.process("68514740: what is 6 multiplied by 5"), containsString("30"));
    }

    // what is 0 plus 16
    @Test
    public void knowsAboutNumberAdd() throws Exception {
        assertThat(queryProcessor.process("68514740: what is 0 plus 16"), containsString("16"));
    }


}
