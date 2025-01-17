package irvine.oeis.a292;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A292825 Decimal expansion of Product_{k&gt;=1} (1 - exp(-2*Pi*(2*k-1))).
 * Formula: 2^(3/8)*exp(-Pi/12)
 * @author Georg Fischer
 */
public class A292825 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A292825() {
    super(0, CR.TWO.pow(CR.THREE.divide(CR.EIGHT)).multiply(CR.ZERO.subtract(CR.PI.divide(CR.valueOf(12))).exp()));
  }
}
