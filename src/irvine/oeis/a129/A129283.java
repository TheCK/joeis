package irvine.oeis.a129;
// Generated by gen_seq4.pl seqop a003 A003415 add(mN) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003415;

/**
 * A129283 (Arithmetic derivative of n) + n.
 * @author Georg Fischer
 */
public class A129283 extends A003415 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A129283() {
    super();
    int bOffset = -1;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN);
  }
}
