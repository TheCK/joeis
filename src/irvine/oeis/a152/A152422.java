package irvine.oeis.a152;
// Generated by gen_seq4.pl dex CR.THREE.sqrt().subtract(CR.ONE).divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152422 Decimal expansion of (sqrt(3)-1)/2.
 * @author Georg Fischer
 */
public class A152422 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152422() {
    super(CR.THREE.sqrt().subtract(CR.ONE).divide(CR.TWO));
  }
}
