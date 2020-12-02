package com.micronaut.gcp.pubsublite.pubsub.subscribers;

import io.micronaut.gcp.pubsub.annotation.PubSubListener;
import io.micronaut.gcp.pubsub.annotation.Subscription;
import io.micronaut.messaging.Acknowledgement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@PubSubListener
public class EventListener {

    @Subscription("event-subscription")
    public void receiveEvent(String uuid, Acknowledgement acknowledgement) {
        log.info("Received message for UUID [{}].", uuid);
        acknowledgement.ack();
    }
}
