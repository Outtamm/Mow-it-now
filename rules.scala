case class rules(mower : Mower, xMax : Int, yMax : Int) {
  def validate(): Boolean = IsInstructionPossible(this.mower)

  /**
   * Bring together all requirement with a <strong>&&</strong> operator. <br/>
   * So to pass all requirements should be filled and return true.
   *
   * @param m : Mower
   * @return : Boolean weather the mower is congruent to a SquareMower
   */
  def IsInstructionPossible(m: Mower): Boolean = {
    isNorthPossible(m) && isRightPossible(m) && isLeftPossible(m) && isSouthPossible(m)

    // add any additional rules here ...
  }

  // all the following are rules ...

  def isNorthPossible(m: Mower): Boolean = m.getY()<=yMax

  def isRightPossible(m: Mower): Boolean = m.getX()<=xMax

  def isSouthPossible(m: Mower): Boolean = m.getY() >= 0

  def isLeftPossible(m: Mower): Boolean = m.getX() >= 0

}

