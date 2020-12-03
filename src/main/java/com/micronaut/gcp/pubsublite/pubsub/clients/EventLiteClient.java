package com.micronaut.gcp.pubsublite.pubsub.clients;

import io.micronaut.gcp.pubsublite.annotation.LiteTopic;
import io.micronaut.gcp.pubsublite.annotation.PubSubLiteClient;

@PubSubLiteClient
public interface EventLiteClient {
    @LiteTopic(name = "event-topic", location = "us-central1-a")
    void publishLiteEvent(String uuid);
}
