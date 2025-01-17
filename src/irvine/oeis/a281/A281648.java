package irvine.oeis.a281;
// Generated by gen_seq4.pl dersimpln at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A281648 (Numerator of Bernoulli(2*n)) read mod n.
 * @author Georg Fischer
 */
public class A281648 extends A000367 {

  protected int mN;
  
  /** Construct the sequence. */
  public A281648() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().mod(Z.valueOf(mN));
  }
}
