import com.sun.tools.javac.util.StringUtils
import java.util.ArrayList
import scala.util.Try
import scala.math.Numeric
import scala.collection.immutable.List
import scala.collection.immutable._

case class Jardin(mowers : List[Mower], coordJardin : Coordonnees) {



  def setJardin(s: String): Unit = {
    if (s.isBlank()=false) {
      var x=s.charAt(0).asDigit
      var y=s.reverse.charAt(0).asDigit

      x=this.coordJardin.x
      y=this.coordJardin.y
    }
    else {
      throw new IllegalArgumentException("Paramètres non valide!")
    }
  }


  /** Renvoie true si la coordonnée est valide, false sinon
   *
   * @param s : coordonnees
   * @return 
   */

  def isValidCoordinate(coordonnees: Coordonnees): Boolean = {
      isNorthPossible(coordonnees) && isRightPossible(coordonnees) && isSouthPossible(coordonnees) && isLeftPossible(coordonnees)

  }
  /** Renvoie true si l'on peut aller au nord, false sinon
   *
   * @param s : coordonnees
   * @return 
   */
  def isNorthPossible(coord: Coordonnees): Boolean = coord.y<= coordJardin.y
   /** Renvoie true si l'on peut aller à l'est, false sinon
   *
   * @param s : coordonnees
   * @return 
   */

  def isRightPossible(coord: Coordonnees): Boolean =  coord.x<= coordJardin.x
 /** Renvoie true si l'on peut aller au sud, false sinon
   *
   * @param s : coordonnees
   * @return 
   */
  def isSouthPossible(coord : Coordonnees): Boolean = coord.y>= 0
 /** Renvoie true si l'on peut aller à l'ouest, false sinon
   *
   * @param s : coordonnees
   * @return 
   */
  def isLeftPossible(coord: Coordonnees): Boolean = coord.x>= 0
}

