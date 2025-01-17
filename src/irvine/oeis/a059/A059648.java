package irvine.oeis.a059;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A059648 a(n) = [[(k^2)*n]-(k*[k*n])], where k = sqrt(2) and [] is the floor function.
 * @author Georg Fischer
 */
public class A059648 extends FloorSequence {

  private final CR mK = CR.SQRT2;

  /** Construct the sequence. */
  public A059648() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(mK.pow(2).multiply(CR.valueOf(n)).floor())
        .subtract(mK.multiply(mK.multiply(CR.valueOf(n)).floor())).floor();
  }

}
