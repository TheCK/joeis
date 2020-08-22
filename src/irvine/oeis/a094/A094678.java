package irvine.oeis.a094;
// Generated by gen_seq4.pl seqop a003 A003474 divide(mN) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003474;

/**
 * A094678 a(n) = A003474(n)/n.
 * @author Georg Fischer
 */
public class A094678 extends A003474 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A094678() {
    super();
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(mN);
  }
}
