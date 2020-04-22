package com.joledzki.randomdogsapi.controllers;


import com.google.gson.Gson;
import com.joledzki.randomdogsapi.models.Cat;
import com.joledzki.randomdogsapi.models.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@Controller
public class MainController {

    public String getDogUrl() throws IOException {
        URL url = new URL("https://random.dog/woof.json");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        Dog dog = new Gson().fromJson(reader, Dog.class);
        return dog.getUrl();
    }

    public String getCatUrl() throws IOException {
        URL url = new URL("https://aws.random.cat/meow");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        Cat cat = new Gson().fromJson(reader, Cat.class);
        return cat.getFile();
    }


    @RequestMapping("/dog")
    public String getDogPage(Model model) throws IOException {
        model.addAttribute("dog",getDogUrl());
        return "dog";
    }

    @RequestMapping("/cat")
    public String getCatPage(Model model) throws IOException {
        model.addAttribute("cat",getCatUrl());
        return "cat";
    }



}
