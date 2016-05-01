import org.junit.Test;

import static org.junit.Assert.*;

/*
TDD
        No production code without a failing test
        4 steps
        Start with the test
        Write production code
        refactor test
        refactor production code
        BDD
        https://vimeo.com/10569751
        https://www.youtube.com/watch?v=hD9e6AauOh0
        https://www.youtube.com/watch?v=xubiP8WoT4E&index=2&list=PLBBog2r6uMCSa9_mNISSpTcbTcKlMAe6t
*/
/**
 * Created by MMAA-local on 5/1/2016.
 */
public class URLParserTest {

    @Test
    public void dummy_basic_http_protocol(){
    URLParser p = new URLParser("http://www.google.com");
    //assertEquals()
    }
}