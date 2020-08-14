package com.example.aiod.model.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.aiod.model.SuperCharacter;
import com.example.aiod.repos.SuperCharacterRepo;


public class Mutation implements GraphQLMutationResolver {
    private SuperCharacterRepo characterRepo;

    public Mutation(SuperCharacterRepo repo){
        this.characterRepo = repo;
    }

    public SuperCharacter addCharacter(String name, Integer age){
        return characterRepo.addCharacter(name, age);
    }

}
