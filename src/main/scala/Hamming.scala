object Hamming {
  //shorter (one line!) : (s1 zip s2).count(e => e._1 != e._2)
  def compute(s1: String, s2: String) = {
    if(s1.length > s2.length) returnHamming(s1, s2)
    else returnHamming(s2, s1)
  }

  def returnHamming(longer: String, shorter: String) = {
    var diff = 0

    for(i <- 0 until shorter.length)
    {
      if(shorter.charAt(i) != longer.charAt(i))
      {
        diff += 1
      }
    }

    diff
  }

}
