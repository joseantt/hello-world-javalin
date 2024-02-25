package org.example;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.html("<h3>Hello World, APP 2 practica 4<h3>"))
                .start(7070);
    }
}