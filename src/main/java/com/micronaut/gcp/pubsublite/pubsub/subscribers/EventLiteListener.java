package com.micronaut.gcp.pubsublite.pubsub.subscribers;

import io.micronaut.gcp.pubsublite.annotation.LiteSubscription;
import io.micronaut.gcp.pubsublite.annotation.PubSubLiteListener;
import io.micronaut.messaging.Acknowledgement;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@PubSubLiteListener
public class EventLiteListener {

    @LiteSubscription(name = "event-subscription",location = "us-central1-a")
    public void receiveEvent(String uuid, Acknowledgement acknowledgement) {
        log.info("Received lite message for UUID [{}].", uuid);
        acknowledgement.ack();
    }
}
