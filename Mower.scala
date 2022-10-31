case class Mower(position : Coordonnees, direction : Direction) {
  def tournerADroite(): Mower = {
    Mower(this.position, this.direction.directionOnTheRight())
  }

  def tournerAGauche(): Mower = {
    Mower(this.position, this.direction.directionOnTheLeft())
  }

  def getX(): Int = {
    this.position.x
  }

  def getY(): Int = {
    this.position.y
  }

  def avancer(jardin: Jardin): Unit = {
    val newCoordinate = this.direction match {
      case North => Coordonnees(this.position.x, this.position.y + 1)
      case East => Coordonnees(this.position.x + 1, this.position.y)
      case South => Coordonnees(this.position.x, this.position.y - 1)
      case West => Coordonnees(this.position.x - 1, this.position.y)
        if (jardin.isValidCoordinate(newCoordinate)) {
          Mower(newCoordinate, this.direction)
        }
        else {
          this
        }

    }
  }


    def print(m : Mower) = m.position.x + " " + m.position.y + " " + m.direction.toString

    def miseAJour(instruction: String, jardin: Jardin): Unit = {
      instruction match {
        case "A" => this.avancer(jardin)
        case "D" => this.tournerADroite()
        case "G" => this.tournerAGauche()
        case x =>
          throw new IllegalArgumentException(" Les seules instructions possibles sont A, D ou G")
          this
      }

    }

  }
