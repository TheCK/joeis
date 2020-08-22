package irvine.oeis.a259;
// Generated by gen_seq4.pl seqop a000 A000108 mod(Z.SIX) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A259667 Catalan numbers mod 6.
 * @author Georg Fischer
 */
public class A259667 extends A000108 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A259667() {
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
    return super.next().mod(Z.SIX);
  }
}
