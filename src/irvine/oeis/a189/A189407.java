package irvine.oeis.a189;
// Generated by gen_seq4.pl floor at 2021-08-24 07:13

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A189407 n+[nr/t]+[ns/t]; r=1, s=-1+sqrt(3), t=1+sqrt(3).
 * @author Georg Fischer
 */
public class A189407 extends FloorSequence {

  private final CR mR = CR.ONE;
  private final CR mS = CR.ZERO.subtract(CR.ONE).add(CR.THREE.sqrt());
  private final CR mT = CR.ONE.add(CR.THREE.sqrt());

  /** Construct the sequence. */
  public A189407() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.valueOf(n).multiply(mR).divide(mT).floor()).add(CR.valueOf(n).multiply(mS).divide(mT).floor());
  }

}
