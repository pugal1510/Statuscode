package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping("/ok")
    public ResponseEntity<String> getOkStatus() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/created")
    public ResponseEntity<String> getCreatedStatus() {
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @GetMapping("/badrequest")
    public ResponseEntity<String> getBadRequestStatus() {
        return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/notfound")
    public ResponseEntity<String> getNotFoundStatus() {
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/internalerror")
    public ResponseEntity<String> getInternalErrorStatus() {
        return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
