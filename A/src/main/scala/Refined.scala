package A

class SRC[_]
class Filter
class Refined {
  def select(cols: SRC[_]*) = new {
    def where(filter: Filter => Filter)(implicit d: DummyImplicit) = {
      new {
        def using(opt: Option[SRC[_]] => Some[SRC[_]])(implicit d: DummyImplicit) = opt
      }
    }
  }
}