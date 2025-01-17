package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184913 n+[rn/s]+[tn/s]+[un/s], where []=floor and r=2^(1/5), s=r^2, t=r^3, u=r^4.
 * @author Georg Fischer
 */
public class A184913 extends FloorSequence {

  private final CR mR = CR.TWO.pow(CR.ONE.divide(CR.FIVE));
  private final CR mS = mR.pow(2);
  private final CR mT = mR.pow(3);
  private final CR mU = mR.pow(4);

  /** Construct the sequence. */
  public A184913() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(mR.multiply(CR.valueOf(n)).divide(mS).floor()).add(mT.multiply(CR.valueOf(n)).divide(mS).floor()).add(mU.multiply(CR.valueOf(n)).divide(mS).floor());
  }

}
