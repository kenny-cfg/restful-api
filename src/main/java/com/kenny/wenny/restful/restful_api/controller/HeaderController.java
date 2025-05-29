package com.kenny.wenny.restful.restful_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/header")
public class HeaderController {
    @GetMapping
    public ResponseEntity<String> getHeader(
            @RequestHeader("x-header-to-return") String headerToReturn
    ) {
        return ResponseEntity.ok(headerToReturn);
    }
}
