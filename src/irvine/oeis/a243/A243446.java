package irvine.oeis.a243;
// Generated by gen_seq4.pl dex CR.THREE.divide(CR.TWO.multiply(CR.PI.sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A243446 Decimal expansion of 3/(2*sqrt(Pi)).
 * @author Georg Fischer
 */
public class A243446 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A243446() {
    super(CR.THREE.divide(CR.TWO.multiply(CR.PI.sqrt())));
  }
}
