package objsets

object Test {
  println("Welcome to the new Scala worksheet")   //> Welcome to the new Scala worksheet

	class Text(val text: String) {
	
	  def contains(words: List[String]): Boolean = {
	    if (words.isEmpty) false
	    else {
				val regex = ("\\b" + words.head + "\\b").r
				if (regex.findFirstIn(text) != None) true
		    else contains(words.tail)
	    }
	  }
	}
	  
	val s1 = new Text("this ios thing is crap")
                                                  //> s1  : objsets.Test.Text = objsets.Test$$anonfun$main$1$Text$1@b684286
	val s2 = new Text("I don't like ios")     //> s2  : objsets.Test.Text = objsets.Test$$anonfun$main$1$Text$1@880ec60
	val s3 = new Text("ios: good for the garbage can")
                                                  //> s3  : objsets.Test.Text = objsets.Test$$anonfun$main$1$Text$1@3f3afe78
	val s4 = new Text("my computer needs a bios upgrade")
                                                  //> s4  : objsets.Test.Text = objsets.Test$$anonfun$main$1$Text$1@7f63425a
	val s5 = new Text("the ios phone needs a bios upgrade")
                                                  //> s5  : objsets.Test.Text = objsets.Test$$anonfun$main$1$Text$1@36d64342

	val words = List("bios")                  //> words  : List[String] = List(bios)
	
	s1.contains(words)                        //> res0: Boolean = false
	s2.contains(words)                        //> res1: Boolean = false
	s3.contains(words)                        //> res2: Boolean = false
	s4.contains(words)                        //> res3: Boolean = true
	s5.contains(words)                        //> res4: Boolean = true
	
	words.tail                                //> res5: List[String] = List()
}