package irvine.oeis.a197;
// Generated by gen_seq4.pl dex CR.THREE.multiply(CR.PI).divide(CR.ONE.add(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A197735 Decimal expansion of 3*pi/(1+pi).
 * @author Georg Fischer
 */
public class A197735 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.multiply(CR.PI).divide(CR.ONE.add(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
