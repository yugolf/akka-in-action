package com.goticks

import akka.actor.{Actor, PoisonPill, Props}
import akka.event.LoggingReceive
object TicketSeller {
  case class Ticket(id: Int)

  //def props(event: String) = ???
  // TODO: ex1-1. アクターのファクトリーメソッド(props)を定義
  // Props(new TicketSeller(event))

  // TODO: ex1-2. メッセージプロトコル(Add)を定義
  //case class Add(tickets: Vector[Ticket])
  // TODO: ex2-1. メッセージプロトコル(Buy, Tickets)を定義
  //case class Buy(tickets: Int)
  case class Tickets(event: String,
                     entries: Vector[Ticket] = Vector.empty[Ticket])
  // TODO: ex3-1. メッセージプロトコル(GetEvent)を定義
  //case object GetEvent
  // TODO: ex4-1. メッセージプロトコル(Cancel)を定義
  //case object Cancel

}


class TicketSeller(event: String) extends Actor {
  import TicketSeller._

  var tickets = Vector.empty[Ticket]

  def receive = LoggingReceive {
    case _ => ???
    // TODO: ex1-3. メッセージ(Add)受信時のふるまいを定義
    //case Add(newTickets) => tickets = tickets ++ newTickets
    // TODO: ex2-2. メッセージ(Buy)受信時のふるまいを定義
    //case Buy(nrOfTickets) =>
    //  val entries = tickets.take(nrOfTickets)
    //  if(entries.size >= nrOfTickets) {
    //    sender() ! Tickets(event, entries)
    //    tickets = tickets.drop(nrOfTickets)
    //  } else sender() ! Tickets(event)
    // TODO: ex3-2. メッセージ(GetEvent)受信時のふるまいを定義
    //case GetEvent => sender() ! Some(BoxOffice.Event(event, tickets.size))
    // TODO: ex4-2. メッセージ(Cancel)受信時のふるまいを定義
    //case Cancel =>
    //  sender() ! Some(BoxOffice.Event(event, tickets.size))
    //  self ! PoisonPill
  }
}

