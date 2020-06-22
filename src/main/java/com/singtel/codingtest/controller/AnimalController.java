package com.singtel.codingtest.controller;

import com.singtel.codingtest.object.Rooster;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    Rooster rooster;

    @ApiOperation(
            value = "Animal Type and Language of th animal",
            notes = "Get the sound of given animal for the given language "
    )
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "Success", response = String.class ) ,
            @ApiResponse(code = 500, message = "Internal Server Error")} )
    @RequestMapping(value = "/getSoundForLanguage", method = RequestMethod.GET)
    public ResponseEntity<?> getSoundForLanguage(@RequestParam("animalType") String animalType, @RequestParam("language") String language) {
        try {
            String sound;
            switch (animalType) {
                case "Rooster":
                    sound = "Sound of the " + animalType + " in " + language + " is " + rooster.sound(language);
                    break;
                default:
                    sound = "No sound found for " + animalType;
            }
            return new ResponseEntity<String>(sound, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

