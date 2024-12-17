package com.android.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndroidController {

    @RequestMapping
    public String getGreeting(){
        return "<h2>Vanako da mapla theni la irundhu</h2>";
    }
}
