package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-23 22:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184659 floor(n*s+h-h*s), where s=(3+sqrt(5))/2, h=-1/3; complement of A184658.
 * @author Georg Fischer
 */
public class A184659 extends FloorSequence {
  /** Construct the sequence. */
  public A184659() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.ZERO.subtract(CR.TWO).add(CR.THREE.multiply(CR.valueOf(n)).add(CR.THREE).multiply(CR.PHI)).divide(CR.THREE.multiply(CR.PHI).subtract(CR.THREE)).floor().subtract(Z.ONE);
  }

}
