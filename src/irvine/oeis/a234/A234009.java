package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.NRot90CornerCounter;

/**
 * A234009 Free polyominoes with 4n squares, having 90-degree rotational symmetry about a square corner.
 * @author jmason
 */
public class A234009 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 4;
    return Z.valueOf(new NRot90CornerCounter(mMax, true, false, false).getCuall().getCounter(mMax));
  }
}
