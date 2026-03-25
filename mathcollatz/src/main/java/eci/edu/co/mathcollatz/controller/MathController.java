package eci.edu.co.mathcollatz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eci.edu.co.mathcollatz.model.Response;
import eci.edu.co.mathcollatz.service.CollatzService;

@RestController
public class CollatzController {

    private final CollatzService collatzService = new CollatzService();

    @GetMapping("/collatzsequence")
    public Response collatzsequence(@RequestParam(value = "value") int value) {
        String sequence = collatzService.getCollatzSequence(value);
        return new Response("collatzsequence", value, sequence);
    }

    @PostMapping("/collatzsequence")
    public Response collatzsequencePost(@RequestParam(value = "value") int value) {
        String sequence = collatzService.getCollatzSequence(value);
        return new Response("collatzsequence", value, sequence);
    }
}
