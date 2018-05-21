package actors

import akka.actor.{Actor, PoisonPill}
import models._

class MessageActor extends Actor{
  override def receive: Receive = {
    case Message(_) => print("got your message")
    case _ => print("We need a translator")
  }
}
