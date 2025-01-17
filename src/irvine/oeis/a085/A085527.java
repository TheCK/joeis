package irvine.oeis.a085;
// Generated by gen_seq4.pl A057934/simple0 at 2022-03-25 23:11

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085527 a(n) = (2n+1)^n.
 * @author Georg Fischer
 */
public class A085527 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2L * mN + 1).pow(mN);
  }
}
