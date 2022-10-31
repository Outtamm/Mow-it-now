case class rules(mower : Mower, xMax : Int, yMax : Int) {
  def validate(): Boolean = IsInstructionPossible(this.mower)

  /** Permet de savoir si l'instruction demandée est réalisable ou non
   *
   * @param m : Mower
   * @return : Booléen 
   */
  def IsInstructionPossible(m: Mower): Boolean = {
    isNorthPossible(m) && isRightPossible(m) && isLeftPossible(m) && isSouthPossible(m)

   
  }

  

  def isNorthPossible(m: Mower): Boolean = m.getY()<=yMax

  def isRightPossible(m: Mower): Boolean = m.getX()<=xMax

  def isSouthPossible(m: Mower): Boolean = m.getY() >= 0

  def isLeftPossible(m: Mower): Boolean = m.getX() >= 0

}

