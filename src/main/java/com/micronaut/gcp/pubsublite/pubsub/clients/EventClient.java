package com.micronaut.gcp.pubsublite.pubsub.clients;

import io.micronaut.gcp.pubsub.annotation.PubSubClient;
import io.micronaut.gcp.pubsub.annotation.Topic;

@PubSubClient
public interface EventClient {

    @Topic("event-topic")
    void publishEvent(String uuid);
}
