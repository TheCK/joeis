package irvine.oeis.a158;
// Generated by gen_seq4.pl dersimpln at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a032.A032741;

/**
 * A158907 Row sums of triangle A158906.
 * @author Georg Fischer
 */
public class A158907 extends A032741 {

  protected int mN;
  
  /** Construct the sequence. */
  public A158907() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN);
  }
}
