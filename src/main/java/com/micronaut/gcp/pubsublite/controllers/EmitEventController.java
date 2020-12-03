package com.micronaut.gcp.pubsublite.controllers;

import com.micronaut.gcp.pubsublite.pubsub.clients.EventClient;
import com.micronaut.gcp.pubsublite.pubsub.clients.EventLiteClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.UUID;

@Controller
public class EmitEventController {

    @Inject
    EventClient eventClient;

    @Inject
    EventLiteClient eventLiteClient;

    @Get("emit")
    public HttpResponse<String> emitEvent(int numberToEmit) {

        for(int i = 0; i < numberToEmit; i++) {
            eventClient.publishEvent(UUID.randomUUID().toString());
        }

        return HttpResponse.ok("Successfully emitted events.");
    }

    @Get("emitLite")
    public HttpResponse<String> emitLiteEvent(int numberToEmit) {

        for(int i = 0; i < numberToEmit; i++) {
            eventLiteClient.publishLiteEvent(UUID.randomUUID().toString());
        }

        return HttpResponse.ok("Successfully emitted events.");
    }
}
