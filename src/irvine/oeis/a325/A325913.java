package irvine.oeis.a325;
// Generated by gen_seq4.pl dersimpln at 2021-09-02 16:26

import irvine.math.z.Z;
import irvine.oeis.a054.A054414;

/**
 * A325913 Integers m such that there are exactly two powers of 2 between 3^m and 3^(m+1).
 * @author Georg Fischer
 */
public class A325913 extends A054414 {

  protected int mN;
  
  /** Construct the sequence */
  public A325913() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mN).subtract(1);
  }
}
