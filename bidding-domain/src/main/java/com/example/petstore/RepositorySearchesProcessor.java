package com.example.petstore;

import com.example.petstore.domain.Bidding;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RepositorySearchesProcessor implements RepresentationModelProcessor<EntityModel<Bidding>> {

    @Override
    public EntityModel<Bidding> process(EntityModel<Bidding> model) {
        // model.add(Link.of(model.getRequiredLink("self").getHref() + "/feed").withRel("feed"));

        // if(model.getContent() instanceof Cat)
        //    model.add(Link.of(model.getRequiredLink("self").getHref() + "/groom").withRel("groom"));

        return model;
    }
}
