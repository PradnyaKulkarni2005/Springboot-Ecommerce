package com.example.journal;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Dev {
    @Autowired
    private Laptop laptop;

    public void build(){
        laptop.compile();
        System.out.println("Building the project in Dev mode...");
        
    }

    
}
