package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053202 Pascal's triangle (excluding first, last two elements of each row) read by rows, row n read mod n.
 * @author Sean A. Irvine
 */
public class A053202 implements Sequence {

  private long mN = 3;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 2;
    }
    return Binomial.binomial(mN, mM).mod(Z.valueOf(mN));
  }
}
