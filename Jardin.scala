import com.sun.tools.javac.util.StringUtils
import java.util.ArrayList
import java.util.List

case class Jardin(mowers : List[Mower], coordJardin : Coordonnees) {
  def isBlank(input: Option[String]): Boolean = {
    input match {
      case None => true
      case Some(s) => s.trim.isEmpty
    }
  }

  def set_ground(s: String): Unit = {
    if (isBlank(s)=false) {
      val surface= s.split(" ")
      this.coordJardin.x= surface[0].toInt
      this.coordJardin.y= Integer.parseInt(surface[1])
    }
    else {
      throw new IllegalArgumentException("Paramètres non valide!")
    }
  }
  def isValidCoordinate(coordonnees: Coordonnees): Boolean = {
    val Occupied = this.mowers.exists(mower => mower.position= coordonnees)
    if (Occupied) {
      false
    }
    else {
      isNorthPossible(coordonnees) && isRightPossible(coordonnees) && isSouthPossible(coordonnees) && isLeftPossible(coordonnees)
    }
  }

  def isNorthPossible(coord: Coordonnees): Boolean = coord.y<= coordJardin.y

  def isRightPossible(coord: Coordonnees): Boolean =  coord.x<= coordJardin.x

  def isSouthPossible(coord : Coordonnees): Boolean = coord.y>= 0

  def isLeftPossible(coord: Coordonnees): Boolean = coord.x>= 0
}
