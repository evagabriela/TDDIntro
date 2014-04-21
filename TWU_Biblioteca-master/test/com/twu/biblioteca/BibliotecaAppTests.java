package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTests {
    private BibliotecaApp user;
//    Welcome Message
    @Test
    public void ShouldWelcomeWhenStartApplication(){
        user = new BibliotecaApp();
        user.setName("Gaby");
        assertEquals(user.getName(), "Gaby");
        assertEquals(user.getMessage(), "Welcome Gaby!");
    }

//    List Books
    public void ShouldListBooks(){
        user = new BibliotecaApp();
        user.getListOfBooks();
//        assertThat();
    }
}
