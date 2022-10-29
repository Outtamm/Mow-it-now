
sealed trait Direction {
  /** Trouve la direction directement à la droite de la tondeuse  * */
  def directionOnTheRight(): Direction

  /** Trouve la direction directement à la gauche de la tondeuse  * */

  def directionOnTheLeft(): Direction
}

case object North extends Direction {
  override def directionOnTheRight(): Direction = East

  override def directionOnTheLeft(): Direction = West


}

case object East extends Direction {
  override def directionOnTheRight(): Direction = South

  override def directionOnTheLeft(): Direction = North


}

case object South extends Direction {
  override def directionOnTheRight(): Direction = West

  override def directionOnTheLeft(): Direction = East
}
case object West extends Direction {
  override def directionOnTheRight(): Direction = North
  override def directionOnTheLeft(): Direction = South
}

object Direction {

  /** Renvoie la direction correspondante à la chaine de caractère s.
   *
   * @param s : une chaine de caractère représentant la direction
   * @return Une option qui renvoie la direction si s est bien une direction valide if the string corresponds to any of the direction
   *         Renvoie une erreur sinon
   */
  def stringToDirectionc(s: String): Option[Direction] = s match {
    case "N" => Some(North);
    case "E" => Some(East);
    case "S" => Some(South);
    case "W" => Some(West);
    case _ => throw new IllegalArgumentException("La direction est soit N, E, S ou W")
  }
}
