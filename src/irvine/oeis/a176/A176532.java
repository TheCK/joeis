package irvine.oeis.a176;
// Generated by gen_seq4.pl dex CR.FIVE.add(CR.THREE.multiply(CR.THREE.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A176532 Decimal expansion of 5+3*sqrt(3).
 * @author Georg Fischer
 */
public class A176532 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A176532() {
    super(CR.FIVE.add(CR.THREE.multiply(CR.THREE.sqrt())));
  }
}
