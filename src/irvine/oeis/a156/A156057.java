package irvine.oeis.a156;
// Generated by gen_seq4.pl dex CR.THREE.log().divide(CR.TWO) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156057 Decimal expansion of log(3)/2.
 * @author Georg Fischer
 */
public class A156057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156057() {
    super(CR.THREE.log().divide(CR.TWO));
  }
}
