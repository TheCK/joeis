package irvine.oeis.a166;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166986 <code>a(n) = 2*floor((n+2)/log(2)) - 4</code>.
 * @author Sean A. Irvine
 */
public class A166986 implements Sequence {

  private static final CR LOG2 = CR.TWO.log();
  private long mN = 2;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(LOG2).floor(32).multiply2().subtract(4);
  }
}
