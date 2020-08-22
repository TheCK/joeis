package irvine.oeis.a243;
// Generated by gen_seq4.pl seqop a003 A003961 add(1) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003961;

/**
 * A243501 Permutation of even numbers: a(n) = 2*A048673(n).
 * @author Georg Fischer
 */
public class A243501 extends A003961 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A243501() {
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
    return super.next().add(1);
  }
}
