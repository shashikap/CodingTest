Please note this,LYB49MKK_dev is company gitlab user name 
Which took from my .gitConfig in local
    [user]
        name = LYB49MKK_dev
        
# Coding Test Solution

Codting Test

##PART A

###Q1

*  How did you unit test it?
    > - Added the junit maven dependecy to use junit
    > - Added flying walking and singing methods to BirdTest class
    > - Since initial solution prints out put returin
    
* How did you optimize the code for maintainability?
    
    > - Created new Animal interface class to abstract the Bird object
    > - Since Animal is the main type, can inherit to other animals
    > - Created new package model to add such interfaces and created enum to show th behaviors of animal

###Q2

* How to optimize the code and changes?
    
    > - Removed the enum since its going to show specific behavior for each
    > - Added Chicken, Duck classes which is a subclass of Birds
    > - Since swimming is only specific to Duck, implemented only in the Duck class
    > - ChickenTest and DuckTest classes added ad unit test

###Q3

* How the implementation done?
    
    > - Implemented a new Rooster class which extends Chicken class
    > - Since Rooster is the type of the chicken, it carries similar features, and its specific type of chicken
    > - Yes, Since Rooster is inherited from chicken, chicken carries the features of bird
        Rooster can be create by implementing Animal interface.

###Q4

* How the implementation done?

    > - Added a Parrot which inherit the feature of bird.
    > - Created the each animal(Dog, Cat) which Parrot is inheriting the sound of.
    > - Since any animal can have sound, made that as the super class of the Animal. This allows to have any sound without 
        modifying any class, which means we can have the implementation for the Parrot who leaves near the frequently ringing phone.

## PART B 
       
###Q1

* How the implementation done?
    
    > - Introduced three new interfaces depending on the Animal category(Swiming, Flying, Walking),didnt remove Animal 
        Since we can put any similar features to mentioned categories
    > - Created Fish class by implementing swiming animal interface
    
###Q2

* How The implementation done?
    
    > - Added two new classes for ClownFish and Shark, which is a sub class of fish.
    
###Q3
 
* How The implementation done?
    
     > - Created Dolphin class by implementing SwimingAnimal
     
## PART D

###Q1

* How The implementation done?
    
     > - Since Butterfly cannot make sound removed the SoundOfAnimal from the Animal class since its the super class of all the class
     > - Implemented the other classes with SoundOfAnimal where necessary.
     > - Created Butterfly class by implementing FlyingAnimal class.
     

###Q2

* How The implementation done?
    
     > - Since Caterpillar metamorphosis of butterfly(since cannot make sound) have to adjust the structure
     > - Added Caterpillar as WalkingAnimal, since this added the SoundOfAnimal class where its necesory
     

## PART E

###Q1

* How The implementation done?
     > - Since every object have a relationship we can check with whether the object is a instance of the type
         to get flying swiming walking and sound making animals
    
## PART F

###Q1
    
* How The implementation done?
    > - Since Rooster is allready having sound classes, overloaded a method to take the sound according to the langauge.
    > - Sound grammer was created by Map inside a Map, eg:Map<String,Map<String,String>>, First key of the map will be the Animal
        And from that can query the language map of the Animal. based on the langauge in the second Map can query the sound.]
        

###Q2
    
* How The implementation done?
    > - Added the depndencies to the pom.xml to make this application as springboot application
    > - Added rest controller to query the sound for the animal
    > - Added API documentation using swagger
    > - SwaggerConfig.java contains configuration and settings of the swagger
    > - This REST API will take query param as argument the input to the method
    > - Once up and running below is the sample request to query
    > - Please visit to http://localhost:8080/swagger-ui.html
    > - In the animal-controller Select the GET /animal/getSoundForLanguage
    > - Enter the parameter accordingly 
    > - Example  animalType=Rooster , language=German
    > - Else you can use postman to query the result please use below sample query
    > - http://localhost:8080/animal/getSoundForLanguage?animalType=Rooster&language=German
    > - On successfull scenarios it will return response code 200
