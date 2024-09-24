package hr.eventsourcing

import java.util.function.Consumer

interface EventStore {
    fun collectEvents(
        scope: String,
        streamId: String,
        eventProducer: Function<Iterable<Any>>,
        postProcessor: Consumer<Iterable<Any>>,
    )

    fun readEvents(scope: String, streamId: String): Iterable<Any>
}