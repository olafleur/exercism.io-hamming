object Hamming {
  def compute(s1: String, s2: String) = {
    var diff = 0

    for(i <- 0 until s1.length)
    {
      if(s1.charAt(i) != s2.charAt(i))
      {
        diff += 1
      }
    }

    diff
  }

}
