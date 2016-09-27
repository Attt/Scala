package n.attt.serivce

import n.attt.bean.Greeting

/**
  * Created by Administrator on 2016/9/27.
  */
trait GreetingService {
  def generateGreetingMessage(name:String):Greeting
}
