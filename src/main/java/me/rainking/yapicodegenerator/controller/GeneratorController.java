package me.rainking.yapicodegenerator.controller;

import me.rainking.yapicodegenerator.service.YapiGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rain
 * @date 2018/11/12
 */
@RestController
public class GeneratorController {
    @Autowired
    private YapiGeneratorService yapiGeneratorService;

    @PostMapping("generator")
    public String generator(@RequestBody String yapiJsonStr){
        return yapiGeneratorService.generate(yapiJsonStr);
    }
}
