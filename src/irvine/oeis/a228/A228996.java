package irvine.oeis.a228;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (exp(x)*(30*x^4+60*x^3+60*x^2-60*x+62)-x-62)/(x-1)^2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A228996 Total sum of the 6th powers of lengths of ascending runs in all permutations of [n].
 * @author Georg Fischer
 */
public class A228996 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228996() {
    super(0, "[[0],[-15,-15],[-2970,-975,15],[-20325,-660,975],[41040,30885,3675],[113455,9254,-2895],[-187822,-80897,-7319],[-7595,20212,3689],[62496,21731,1829],[1736,465,31]]", "[0,1,66,992,9846,86782,765506,7112202,71000398,766053422]", 8);
    setGfType(1);
  }
}
