package irvine.oeis.a065;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (-1/16)*(1-4*x)^(-5/2)*((56*x^2-44*x+6)*sqrt(1-4*x)+(16*x^3-180*x^2+56*x-6))*exp((1-sqrt(1-4*x))/2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A065945 Bessel polynomial {y_n}''(2).
 * @author Georg Fischer
 */
public class A065945 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A065945() {
    super(0, "[[0],[1],[48,2,4],[720,477,135],[5346,3052,446],[2700,768,24],[-540,-288,-36]]", "[0,0,6,210,6390,201810,6895140]", 5);
    setGfType(1);
  }
}
