/**
 *  Copyright (C) 2011-2012 Typesafe <http://typesafe.com/>
 */
package com.typesafe.akkademo.processor.service

import akka.actor.Actor
import com.typesafe.akkademo.common.PlayerBet

class BettingProcessor extends Actor {

  var simulatedActorSystemDeathSequence: Int = 0

  /**s
  * TASKS : 
  * Create worker for dangerous task (using UnstableRepository actor)
  * Supervise worker -> handle errors
  * Send confirmation message back to Betting service
  */

  def receive = {
	case m => 
	  // DO NOT CHANGE THE CODE BELOW - USED TO SIMULATE A BIIIG CRASH
	  simulatedActorSystemDeathSequence += 1
	  if (simulatedActorSystemDeathSequence % 121 == 0) context.system.shutdown()
			
	  // ADD YOUR CODE BELOW
	  m match { 
		case bet: PlayerBet =>
	  }
  }
}