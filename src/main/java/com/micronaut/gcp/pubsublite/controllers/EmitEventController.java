package com.micronaut.gcp.pubsublite.controllers;

import com.micronaut.gcp.pubsublite.pubsub.clients.EventClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.UUID;

@Controller
public class EmitEventController {

    @Inject
    EventClient eventClient;

    @Get("emit")
    public HttpResponse<String> emitEvent(int numberToEmit) {

        for(int i = 0; i < numberToEmit; i++) {
            eventClient.emitEvent(UUID.randomUUID().toString());
        }

        return HttpResponse.ok("Successfully emitted events.");
    }
}
