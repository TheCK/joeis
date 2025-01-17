package irvine.oeis.a115;
// Generated by gen_seq4.pl dersimpln at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A115964 Denominator of sum_{i=1..n} 1/prime(i)^3.
 * @author Georg Fischer
 */
public class A115964 extends A002110 {

  protected int mN;
  
  /** Construct the sequence. */
  public A115964() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().pow(3);
  }
}
