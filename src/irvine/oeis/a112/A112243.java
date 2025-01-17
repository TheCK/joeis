package irvine.oeis.a112;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((x*(1+x))/(1-2*x))
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A112243 Expansion of exp(x(1+x)/(1-2x)).
 * @author Georg Fischer
 */
public class A112243 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A112243() {
    super(0, "[[0],[2],[2,4],[-9,-4],[3,1]]", "[1,1,7,55,577]", 3);
    setGfType(1);
  }
}
