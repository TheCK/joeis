package irvine.oeis.a233;
// Generated by gen_seq4.pl arsimple/simple1 at 2021-11-18 23:20

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A233442 2^n mod n^3.
 * @author Georg Fischer
 */
public class A233442 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return Z.ONE.shiftLeft(mN).mod(n.pow(3));
  }
}
