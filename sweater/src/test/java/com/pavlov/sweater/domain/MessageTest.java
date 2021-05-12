package com.pavlov.sweater.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    @Test
    void test() {
        String text = "We are the champions";
        String tag = "#we";
        User usr = new User();
        Message msg = new Message(text, tag, usr);
        assertEquals(text, msg.getText());
        assertEquals(tag, msg.getTag());
        assertEquals(usr, msg.getAuthor());
    }
}