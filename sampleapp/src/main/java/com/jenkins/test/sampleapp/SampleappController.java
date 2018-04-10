package com.jenkins.test.sampleapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
class SampleappController {
   @Autowired
   private SampleappApplication sampleapp;
 @RequestMapping("/sum")
  String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
     return String.valueOf(sampleapp.sum(a,b));
 }    
}
