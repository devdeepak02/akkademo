import actors.MessageActor
import akka.actor.{ActorSystem, PoisonPill, Props}
import models.Message

object Application {

  def main(args: Array[String]): Unit = {

    val actorSystem = ActorSystem("demoActorSystem")
    val messageActor = actorSystem.actorOf(Props[MessageActor],"MessageActor")
    messageActor ! Message("new message")
    messageActor ! "new message"

    messageActor ! PoisonPill

    actorSystem.terminate()
  }

}
