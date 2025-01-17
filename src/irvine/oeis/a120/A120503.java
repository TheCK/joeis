package irvine.oeis.a120;
// Generated by gen_seq4.pl seqop a007 A007844 divide(3) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007844;

/**
 * A120503 Generalized meta-Fibonacci sequence a(n) with parameters s=0 and k=3.
 * @author Georg Fischer
 */
public class A120503 extends A007844 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A120503() {
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
    return super.next().divide(3);
  }
}
