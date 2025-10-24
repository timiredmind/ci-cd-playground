package com.timiremind.springgithubaction

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class HelloController {

    @GetMapping("/hello")
    fun hello(): ResponseEntity<String?> {
        return ResponseEntity.ok("Hello from the other side. Application up and running")
    }
}