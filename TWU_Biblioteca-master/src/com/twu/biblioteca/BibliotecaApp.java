package com.twu.biblioteca;

public class BibliotecaApp {

    private short message;

    public static void main(String[] args) {
        System.out.println("Welcome To Biblioteca!, please enter your name");
        System.out.println("");
    }


    private String name = "";

    public String getName(){
        return name;
    }

    public String getMessage()
    {
        if (name == "")
        {
            return "Welcome!";
        }
        else
        {
            return "Welcome " + name + "!";
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public void getListOfBooks() {
    }
}
