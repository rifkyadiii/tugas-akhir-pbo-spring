package com.project_pbo.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String viewMahasiswaPage() {
        return "mahasiswa";
    }
}
