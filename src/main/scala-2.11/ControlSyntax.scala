object ControlSyntax {
  def bar():String={
    //"foo"
    "bar"
  }
  def printOver18(age:Int):Unit={
    val message=if(age<18){
      "18歳未満です"
    } else {
      "18歳以上です"
    }
    println(message)
  }
  def printWhileResult(): Unit = {
    var i = 0
    val result = while (i < 1000000000) i = i + 1
    println(result)
  }
  def doubleLoop(): Unit = {
    for (x <- 1 to 5; y <- 1 until 5) {
      println("x = " + x + " y = " + y)
    }
  }


}
