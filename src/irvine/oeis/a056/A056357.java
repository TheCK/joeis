package irvine.oeis.a056;
// Generated by gen_seq4.pl dersimpln at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000011;

/**
 * A056357 Number of bracelet structures using exactly two different colored beads.
 * @author Georg Fischer
 */
public class A056357 extends A000011 {

  protected int mN;
  
  /** Construct the sequence. */
  public A056357() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(1);
  }
}
