package com.example.aiod.model.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.aiod.model.SuperCharacter;
import com.example.aiod.repos.SuperCharacterRepo;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private final SuperCharacterRepo superCharacterRepo;

    public Query(SuperCharacterRepo superCharacterRepo) {
        this.superCharacterRepo = superCharacterRepo;
    }

    public List<SuperCharacter> characters(){
        return  superCharacterRepo.getTheCharacters();
    }
    public SuperCharacter characterById(String id){
        return superCharacterRepo.getCharacterById(id);
    }
}

