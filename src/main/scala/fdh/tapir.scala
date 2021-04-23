package fdh
import sttp.tapir._
import sttp.tapir.json.circe._
import sttp.tapir.generic.SchemaDerivation
import sttp.tapir.codec.refined.TapirCodecRefined
import sttp.tapir.codec.enumeratum.TapirCodecEnumeratum
object tapir extends Tapir
  with SchemaDerivation
  with TapirJsonCirce
  with TapirAliases
  with TapirCodecRefined
  with TapirCodecEnumeratum
