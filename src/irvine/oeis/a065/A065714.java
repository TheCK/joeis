package irvine.oeis.a065;
// Generated by gen_seq4.pl num1dig at 2021-04-28 10:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;


/**
 * A065714 Number of 3's in decimal expansion of 2^n.
 * @author Georg Fischer
 */
public class A065714 implements Sequence {

  protected int mN = -1;
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.digitCounts(Z.ONE.shiftLeft(mN), 10)[3]);
  }
}
