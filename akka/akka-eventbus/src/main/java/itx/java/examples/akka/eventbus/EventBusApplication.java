package itx.java.examples.akka.eventbus;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class EventBusApplication {
	
	public static void main(String[] args) {
		
		final ActorSystem system = ActorSystem.create("Events");
		
		system.actorOf(Props.create(Subscriber.class), "subscriber1");
		//another node
		system.actorOf(Props.create(Subscriber.class), "subscriber2");
		system.actorOf(Props.create(Subscriber.class), "subscriber3");
		
		ActorRef publisher = system.actorOf(Props.create(Publisher.class), "publisher");
		publisher.tell("hello", null);
		
	}

}
