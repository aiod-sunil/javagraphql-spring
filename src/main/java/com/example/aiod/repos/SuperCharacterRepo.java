package com.example.aiod.repos;

import com.example.aiod.model.SuperCharacter;
import kotlin.collections.ArrayDeque;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SuperCharacterRepo {
    private final List<SuperCharacter>  theCharacters=new ArrayDeque<>();
    public SuperCharacterRepo(){
        seedCharacters();
    }
    private  void seedCharacters(){
         var c1=  new  SuperCharacter("Char1","Super Character1",33);
         var c2=  new  SuperCharacter("Char2","Two is My Name",147);
         theCharacters.add(c1);
         theCharacters.add(c2);
    }
    public List<SuperCharacter> getTheCharacters() {
        return theCharacters;
    }
    public SuperCharacter getCharacterById(String id){
        var matched = this.theCharacters.stream()
                .filter(c->c.id().equalsIgnoreCase(id))
                .collect(Collectors.toList());

        if( matched.size() > 0){
            return matched.get(0);
        }else{
            return null;
        }
    }
    public SuperCharacter addCharacter(String name, Integer age){
        SuperCharacter newChar = new SuperCharacter("Char" + (this.theCharacters.size()+1),
                name,
                age);

      theCharacters.add(newChar);
        return newChar;
    }
}
