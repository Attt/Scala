package n.attt.serivce.impl

import java.util.concurrent.atomic.AtomicLong

import n.attt.bean.Greeting
import n.attt.serivce.GreetingService
import org.springframework.stereotype.Service

import scala.collection.JavaConversions

/**
  * Created by Administrator on 2016/9/27.
  */
@Service
class GreetingServiceImpl extends GreetingService{

  private val counter:AtomicLong = new AtomicLong()
  private val template:String = "Hello!,%s"

  @Override
  def generateGreetingMessage(name: String): Greeting = {
    System.out.println("==== out greeting ====")
    val map = Map("test" -> "t1","111" -> "222")
    System.out.print(map)
    return new Greeting(counter.incrementAndGet(),String.format(template,name),JavaConversions.mapAsJavaMap(map))
  }

}
