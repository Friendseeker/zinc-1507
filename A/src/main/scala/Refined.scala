package A

class SRC[_]
class Refined {
  def select() = new {
    def where() = {
      new {
        def using(opt: Option[SRC[_]] => Some[SRC[_]]) = opt
      }
    }
  }
}