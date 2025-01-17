package irvine.oeis.a324;
// Generated by gen_seq4.pl seqop a318 A318468 divide(2) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a318.A318468;

/**
 * A324659 a(n) = (1/2)*A318468(n), where A318468(n) is bitwise-AND of 2*n and sigma(n).
 * @author Georg Fischer
 */
public class A324659 extends A318468 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A324659() {
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
    return super.next().divide(2);
  }
}
